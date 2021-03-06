// Targeted by JavaCPP version 1.4.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class gunrock extends org.bytedeco.javacpp.presets.GunrockConfig {
    static { Loader.load(); }

// Parsed from /home/zangetsu/proj/private/gpu/javacpp-presets/gunrock/cppbuild/linux-x86_64/gunrock/gunrock/gunrock.h

// ----------------------------------------------------------------------------
// Gunrock -- Fast and Efficient GPU Graph Library
// ----------------------------------------------------------------------------
// This source code is distributed under the terms of LICENSE.TXT
// in the root directory of this source distribution.
// ----------------------------------------------------------------------------

/**
 * \file gunrock.h
 *
 * \brief Main library header file. Defines public C interface.
 * The Gunrock public interface is a C-only interface to enable linking
 * with code written in other languages. While the internals of Gunrock
 * are not limited to C.
 */

// #include <stdlib.h>
// #include <stdbool.h>
// #include <stdio.h>
// #include <string.h>

/**
 * \brief VertexId data type enumerators.
 */
/** enum VtxIdType */
public static final int
    VTXID_INT = 0;  // Integer

/**
 * \brief SizeT data type enumerators.
 */
/** enum SizeTType */
public static final int
    SIZET_INT = 0;  // Unsigned integer

/**
 * \brief Value data type enumerators.
 */
/** enum ValueType */
public static final int
    VALUE_INT = 0,    // Integer
    VALUE_UINT = 1,   // Unsigned integer
    VALUE_FLOAT = 2;  // Float

/**
 * \brief Data type configuration used to specify data types.
 */
public static class GRTypes extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GRTypes() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GRTypes(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GRTypes(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GRTypes position(long position) {
        return (GRTypes)super.position(position);
    }

    public native @Cast("VtxIdType") int VTXID_TYPE(); public native GRTypes VTXID_TYPE(int VTXID_TYPE);  // VertexId data type
    public native @Cast("SizeTType") int SIZET_TYPE(); public native GRTypes SIZET_TYPE(int SIZET_TYPE);  // SizeT data type
    public native @Cast("ValueType") int VALUE_TYPE(); public native GRTypes VALUE_TYPE(int VALUE_TYPE);  // Value data type
}

/**
 * \brief GunrockGraph as a standard graph interface.
 */
public static class GRGraph extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GRGraph() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GRGraph(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GRGraph(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GRGraph position(long position) {
        return (GRGraph)super.position(position);
    }

    public native @Cast("size_t") long num_nodes(); public native GRGraph num_nodes(long num_nodes);  // Number of nodes in graph
    public native @Cast("size_t") long num_edges(); public native GRGraph num_edges(long num_edges);  // Number of edges in graph
    public native Pointer row_offsets(); public native GRGraph row_offsets(Pointer row_offsets);  // CSR row offsets
    public native Pointer col_indices(); public native GRGraph col_indices(Pointer col_indices);  // CSR column indices
    public native Pointer col_offsets(); public native GRGraph col_offsets(Pointer col_offsets);  // CSC column offsets
    public native Pointer row_indices(); public native GRGraph row_indices(Pointer row_indices);  // CSC row indices
    public native Pointer edge_values(); public native GRGraph edge_values(Pointer edge_values);  // Associated values per edge

    public native Pointer node_value1(); public native GRGraph node_value1(Pointer node_value1);  // Associated values per node
    public native Pointer edge_value1(); public native GRGraph edge_value1(Pointer edge_value1);  // Associated values per edge
    public native Pointer node_value2(); public native GRGraph node_value2(Pointer node_value2);  // Associated values per node
    public native Pointer edge_value2(); public native GRGraph edge_value2(Pointer edge_value2);  // Associated values per edge
    public native Pointer aggregation(); public native GRGraph aggregation(Pointer aggregation);  // Global reduced aggregation
}

/**
 * \brief Source Vertex Mode enumerators.
 */
/** enum SrcMode */
public static final int
    manually = 0,        // Manually set up source node
    randomize = 1,       // Random generate source node
    largest_degree = 2;  // Largest-degree node as source

/**
 * \brief arguments configuration used to specify arguments.
 */
public static class GRSetup extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GRSetup() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GRSetup(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GRSetup(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GRSetup position(long position) {
        return (GRSetup)super.position(position);
    }

    public native @Cast("bool") boolean quiet(); public native GRSetup quiet(boolean quiet);  // Whether to print out to STDOUT
    public native @Cast("bool") boolean mark_predecessors(); public native GRSetup mark_predecessors(boolean mark_predecessors);  // Whether to mark predecessor or not
    public native @Cast("bool") boolean enable_idempotence(); public native GRSetup enable_idempotence(boolean enable_idempotence);  // Whether or not to enable idempotent
    public native IntPointer source_vertex(); public native GRSetup source_vertex(IntPointer source_vertex);  // Source nodes define where to start
    public native int num_iters(); public native GRSetup num_iters(int num_iters);  // Number of BFS runs (currently only support BFS)
    public native int delta_factor(); public native GRSetup delta_factor(int delta_factor);  // SSSP delta-factor parameter
    public native IntPointer device_list(); public native GRSetup device_list(IntPointer device_list);  // Setting which device(s) to use
    public native @Cast("unsigned int") int num_devices(); public native GRSetup num_devices(int num_devices);  // Number of devices for computation
    public native @Cast("unsigned int") int max_iters(); public native GRSetup max_iters(int max_iters);  // Maximum number of iterations allowed
    public native @Cast("unsigned int") int top_nodes(); public native GRSetup top_nodes(int top_nodes);  // K value for top k / PageRank problem
    public native float pagerank_delta(); public native GRSetup pagerank_delta(float pagerank_delta);  // PageRank specific value
    public native float pagerank_error(); public native GRSetup pagerank_error(float pagerank_error);  // PageRank specific value
    public native @Cast("bool") boolean pagerank_normalized(); public native GRSetup pagerank_normalized(boolean pagerank_normalized);  // PageRank specific flag
    public native float max_queue_sizing(); public native GRSetup max_queue_sizing(float max_queue_sizing);  // Setting frontier queue size
    public native @Cast("char*") BytePointer traversal_mode(); public native GRSetup traversal_mode(BytePointer traversal_mode);  // Traversal mode: 0 for LB, 1 TWC
    public native @Cast("SrcMode") int source_mode(); public native GRSetup source_mode(int source_mode);  // Source mode rand/largest_degree
}

/**
 * \brief Initialization function for GRSetup.
 *
 * @param [out] num_iters Rounds of graph primitive to run.
 * @param [in]  source Pointer to source nodes array for each round.
 *
 * @return Initialized configurations object.
 */
// Proper way to check for C99
// #if __STDC_VERSION__ >= 199901L
// http://clang.llvm.org/compatibility.html#inline
// Link mentions is an issue with C99, not a clang specific issue
public static native GRSetup InitSetup(int num_iters, IntPointer source);
public static native GRSetup InitSetup(int num_iters, IntBuffer source);
public static native GRSetup InitSetup(int num_iters, int[] source);

// #ifdef __cplusplus
// #endif

/**
 * \brief Breath-first search public interface.
 *
 * @param [out] grapho Output data structure contains results.
 * @param [in]  graphi Input data structure contains graph.
 * @param [in]  config Primitive-specific configurations.
 * @param [in]  data_t Primitive-specific data type setting.
 *
 * @return Elapsed run time in milliseconds
 */
public static native float gunrock_bfs(
    GRGraph grapho,
    @Const GRGraph graphi,
    @Const GRSetup config,
    @Const @ByVal GRTypes data_t);  // Data type Configurations

/*
 * @brief Simple interface take in CSR arrays as input
 *
 * @param[out] bfs_label            Return BFS label (depth) per nodes
 * @param[out] bfs_label            Return the predecessor per nodes
 * @param[in]  num_nodes            Number of nodes of the input graph
 * @param[in]  num_edges            Number of edges of the input graph
 * @param[in]  row_offsets          CSR-formatted graph input row offsets
 * @param[in]  col_indices          CSR-formatted graph input column indices
 * @param[in]  num_iters            Number of BFS runs. Note if num_iters > 1, the bfs_lbel will only store the results from the last run
 * @param[in]  source               Sources to begin traverse
 * @param[in]  source_mode          Enumerator of source mode: manually, randomize, largest_degree
 * @param[in]  mark_predecessors    If the flag is set, mark predecessors instead of bfs label
 * @param[in]  enable_idempotence   If the flag is set, use optimizations that allow idempotence operation (will usually bring better performance)
 */
public static native float bfs(
    IntPointer bfs_label,
    IntPointer bfs_pred,
    int num_nodes,
    int num_edges,
    @Const IntPointer row_offsets,
    @Const IntPointer col_indices,
    int num_iters,
    IntPointer source,
    @Cast("SrcMode") int source_mode,
    @Cast("const bool") boolean mark_predecessors,
    @Cast("const bool") boolean enable_idempotence);
public static native float bfs(
    IntBuffer bfs_label,
    IntBuffer bfs_pred,
    int num_nodes,
    int num_edges,
    @Const IntBuffer row_offsets,
    @Const IntBuffer col_indices,
    int num_iters,
    IntBuffer source,
    @Cast("SrcMode") int source_mode,
    @Cast("const bool") boolean mark_predecessors,
    @Cast("const bool") boolean enable_idempotence);
public static native float bfs(
    int[] bfs_label,
    int[] bfs_pred,
    int num_nodes,
    int num_edges,
    @Const int[] row_offsets,
    @Const int[] col_indices,
    int num_iters,
    int[] source,
    @Cast("SrcMode") int source_mode,
    @Cast("const bool") boolean mark_predecessors,
    @Cast("const bool") boolean enable_idempotence);

/**
 * \brief Betweenness centrality public interface.
 *
 * @param [out] grapho Output data structure contains results.
 * @param [in]  graphi Input data structure contains graph.
 * @param [in]  config Primitive-specific configurations.
 * @param [in]  data_t Primitive-specific data type setting.
 */
public static native void gunrock_bc(
    GRGraph grapho,
    @Const GRGraph graphi,
    @Const GRSetup config,
    @Const @ByVal GRTypes data_t);  // Data type Configurations

/**
 * \brief Betweenness centrality simple public interface.
 *
 * @param [out] bc_scores Return betweenness centralities.
 * @param [in] num_nodes Input graph number of nodes.
 * @param [in] num_edges Input graph number of edges.
 * @param [in] row_offsets Input graph row_offsets.
 * @param [in] col_indices Input graph col_indices.
 * @param [in] source Source node to start.
 */
public static native void bc(
    FloatPointer bc_scores,
    int num_nodes,
    int num_edges,
    @Const IntPointer row_offsets,
    @Const IntPointer col_indices,
    int source);
public static native void bc(
    FloatBuffer bc_scores,
    int num_nodes,
    int num_edges,
    @Const IntBuffer row_offsets,
    @Const IntBuffer col_indices,
    int source);
public static native void bc(
    float[] bc_scores,
    int num_nodes,
    int num_edges,
    @Const int[] row_offsets,
    @Const int[] col_indices,
    int source);      // Source vertex to start

/**
 * \brief Connected component public interface.
 *
 * @param [out] grapho Output data structure contains results.
 * @param [in]  graphi Input data structure contains graph.
 * @param [in]  config Primitive-specific configurations.
 * @param [in]  data_t Primitive-specific data type setting.
 */
public static native void gunrock_cc(
    GRGraph grapho,
    @Const GRGraph graphi,
    @Const GRSetup config,
    @Const @ByVal GRTypes data_t);  // Data type Configurations

/**
 * \brief Connected component simple public interface.
 *
 * @param [out] component Return per-node component IDs.
 * @param [in] num_nodes Input graph number of nodes.
 * @param [in] num_edges Input graph number of edges.
 * @param [in] row_offsets Input graph row_offsets.
 * @param [in] col_indices Input graph col_indices.
 <p>
 *@return int number of connected components in the graph.
 */
public static native int cc(
    IntPointer component,
    int num_nodes,
    int num_edges,
    @Const IntPointer row_offsets,
    @Const IntPointer col_indices);
public static native int cc(
    IntBuffer component,
    int num_nodes,
    int num_edges,
    @Const IntBuffer row_offsets,
    @Const IntBuffer col_indices);
public static native int cc(
    int[] component,
    int num_nodes,
    int num_edges,
    @Const int[] row_offsets,
    @Const int[] col_indices);  // Input graph col_indices

/**
 * \brief Single-source shortest path public interface.
 *
 * @param [out] grapho Output data structure contains results.
 * @param [in]  graphi Input data structure contains graph.
 * @param [in]  config Primitive-specific configurations.
 * @param [in]  data_t Primitive-specific data type setting.
 *
 * @return Elapsed run time in milliseconds
 */
public static native float gunrock_sssp(
    GRGraph grapho,
    @Const GRGraph graphi,
    @Const GRSetup config,
    @Const @ByVal GRTypes data_t);  // Data type Configurations

/**
 * \brief Single-source shortest path simple public interface.
 *
 * @param [out] distances Return shortest distances.
 * @param [out] preds Return predecessor of each node
 * @param [in] num_nodes Input graph number of nodes.
 * @param [in] num_edges Input graph number of edges.
 * @param [in] row_offsets Input graph row_offsets.
 * @param [in] col_indices Input graph col_indices.
 * @param [in] edge_values Input graph edge weight.
 * @param [in] num_iters How many rounds of SSSP do we want to run.
 * @param [in] source Source node to start.
 * @param [in] mark_preds Whether to mark the predecessors.
 *
 * @return Elapsed run time in milliseconds
 */
public static native float sssp(
    @Cast("unsigned int*") IntPointer distances,
    IntPointer preds,
    int num_nodes,
    int num_edges,
    @Const IntPointer row_offsets,
    @Const IntPointer col_indices,
    @Cast("const unsigned int*") IntPointer edge_values,
    int num_iters,
    IntPointer source,
    @Cast("const bool") boolean mark_preds);
public static native float sssp(
    @Cast("unsigned int*") IntBuffer distances,
    IntBuffer preds,
    int num_nodes,
    int num_edges,
    @Const IntBuffer row_offsets,
    @Const IntBuffer col_indices,
    @Cast("const unsigned int*") IntBuffer edge_values,
    int num_iters,
    IntBuffer source,
    @Cast("const bool") boolean mark_preds);
public static native float sssp(
    @Cast("unsigned int*") int[] distances,
    int[] preds,
    int num_nodes,
    int num_edges,
    @Const int[] row_offsets,
    @Const int[] col_indices,
    @Cast("const unsigned int*") int[] edge_values,
    int num_iters,
    int[] source,
    @Cast("const bool") boolean mark_preds);

/**
 * \brief PageRank public interface.
 *
 * @param [out] grapho Output data structure contains results.
 * @param [in]  graphi Input data structure contains graph.
 * @param [in]  config Primitive-specific configurations.
 * @param [in]  data_t Primitive-specific data type setting.
 */
public static native void gunrock_pagerank(
    GRGraph grapho,
    @Const GRGraph graphi,
    @Const GRSetup config,
    @Const @ByVal GRTypes data_t);  // Data type Configurations

/**
 * \brief PageRank simple public interface.
 *
 * @param [out] node_ids Return top-ranked vertex IDs.
 * @param [out] pagerank Return top-ranked PageRank scores.
 * @param [in] num_nodes Input graph number of nodes.
 * @param [in] num_edges Input graph number of edges.
 * @param [in] row_offsets Input graph row_offsets.
 * @param [in] col_indices Input graph col_indices.
 * @param [in] normalized Whether to perform a normalized PageRank
 */
public static native void pagerank(
    IntPointer node_ids,
    FloatPointer pagerank,
    int num_nodes,
    int num_edges,
    @Const IntPointer row_offsets,
    @Const IntPointer col_indices,
    @Cast("bool") boolean normalized);
public static native void pagerank(
    IntBuffer node_ids,
    FloatBuffer pagerank,
    int num_nodes,
    int num_edges,
    @Const IntBuffer row_offsets,
    @Const IntBuffer col_indices,
    @Cast("bool") boolean normalized);
public static native void pagerank(
    int[] node_ids,
    float[] pagerank,
    int num_nodes,
    int num_edges,
    @Const int[] row_offsets,
    @Const int[] col_indices,
    @Cast("bool") boolean normalized);   // normalized pagerank flag

// TODO Add other primitives

// #ifdef __cplusplus
// #endif

// Leave this at the end of the file
// Local Variables:
// mode:c++
// c-file-style: "NVIDIA"
// End:


}
