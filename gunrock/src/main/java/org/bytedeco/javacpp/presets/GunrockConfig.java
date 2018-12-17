package org.bytedeco.javacpp.presets;/*
 * Copyright (C) 2016-2017 Samuel Audet
 *
 * Licensed either under the Apache License, Version 2.0, or (at your option)
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation (subject to the "Classpath" exception),
 * either version 2, or any later version (collectively, the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     http://www.gnu.org/licenses/
 *     http://www.gnu.org/software/classpath/license.html
 *
 * or as provided in the LICENSE.txt file that accompanied this code.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//package org.bytedeco.javacpp.presets;

import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

/**
 *
 * @author Ladislav Jech
 */
@Properties(
        value =
            @Platform(
                    value = {"linux-x86_64"},
                    preloadpath = {"/usr/lib64/", "/usr/lib/"},
                    includepath = {
                            "/usr/include",
                    },
                    linkpath = {"/home/zangetsu/proj/private/gpu/javacpp-presets/gunrock/cppbuild/linux-x86_64/gunrock/build/lib/"},
                    //define = {""},
                    include = {
                        "/home/zangetsu/proj/private/gpu/javacpp-presets/gunrock/cppbuild/linux-x86_64/gunrock/gunrock/gunrock.h" /**,
                        "json_spirit_writer_template.h",
                        "basic_utils.h",
                        "random_bits.h",
                        "json_spirit_value.h",
                        "sysinfo.h",
                        "test_utils.h",
                        "gitsha1.h",
                        "json_spirit_writer_options.h"*/},
                    link = {"gunrock"},
                    resource = {"include", "lib64"}
                    ),
        target = "org.bytedeco.javacpp.gunrock"

)
public class GunrockConfig implements InfoMapper {
    public void map(InfoMap infoMap) {

        }
    }

