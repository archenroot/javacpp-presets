#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" gunrock
    popd
    exit
fi

mkdir -p $PLATFORM
cd $PLATFORM
INSTALL_PATH=`pwd`
git clone --recursive https://github.com/gunrock/gunrock.git
cd gunrock

#sedinplace '/cmake_minimum_required/d' $(find ./ -iname CMakeLists.txt)
#sedinplace '/cmake_minimum_required/d' $(find ./ -iname CMakeLists.txt)

sedinplace 's/CUDA_NVCC_FLAGS -std=c++11/CUDA_NVCC_FLAGS -std=c++11 -D__CUDA_NO_HALF_OPERATORS__/g' $(find ./ -iname CMakeLists.txt)

case $PLATFORM in
    linux-x86_64)
        mkdir build
        cd build
        cmake ..
        make -j $MAKEJ
       # make test
        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        ;;
esac

cd ../..
