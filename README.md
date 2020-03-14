# credit-card-fraud-detection

To simplify the code implementation

1) No input file validation have been implemented. as a batch processing it should be able to decide chuck size, skip transactions etc as Spring Batch.
    
2) All data are processed in memory, It could cause an OutOfMemory Exception depending on the input file size and memory allocation.

3) Parallel processing or multi-threading are not implemented in this excise.
