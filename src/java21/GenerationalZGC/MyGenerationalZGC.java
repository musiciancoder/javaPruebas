package java21.GenerationalZGC;

public class MyGenerationalZGC {

 /*
elaborate on 8. Generational ZGC (JEP 429) --> Noes importante darle bola a esto, es solo teoria
JEP 429: Generational ZGC (JEP 439) is an enhancement to the Z Garbage Collector (ZGC) introduced in Java 21. This enhancement extends ZGC to support generational garbage collection, which aims to improve application performance by more efficiently managing young and old objects1.

Overview
Generational garbage collection divides the heap into different generations, typically a young generation for newly created objects and an old generation for objects that have survived multiple garbage collection cycles. This approach leverages the weak generational hypothesis, which states that most objects die young1.

Key Features
Separate Generations: ZGC now maintains separate generations for young and old objects. This allows for more frequent collection of young objects, which tend to die young, reducing the risk of allocation stalls1.

Lower Heap Memory Overhead: By efficiently managing young objects, the generational ZGC reduces the required heap memory overhead.

Lower Garbage Collection CPU Overhead: The generational approach reduces the CPU overhead associated with garbage collection.

Minimal Manual Configuration: Generational ZGC requires minimal manual configuration, as it automatically manages the size of generations and the number of threads used by the garbage collector.

Benefits
Improved Performance: Applications running with generational ZGC should experience lower risks of allocation stalls, lower heap memory overhead, and lower garbage collection CPU overhead.

Scalability: Generational ZGC supports heap sizes from a few hundred megabytes up to many terabytes, maintaining low pause times.

Ease of Use: Minimal manual configuration is needed, making it easier for developers to adopt and use generational ZGC.

  */
}
