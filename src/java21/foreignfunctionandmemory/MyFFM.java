package java21.foreignfunctionandmemory;

public class MyFFM {


    /*
    Do JNI and FFM API basically do the same ?

    Yes, both the Java Native Interface (JNI) and the Foreign Function & Memory (FFM) API essentially enable Java programs to interact with native code and memory. However, they have different approaches and advantages. Let's compare them:

### Java Native Interface (JNI)

**Purpose**:
- Allows Java code to call and be called by native applications and libraries written in other languages like C and C++.

**Key Features**:
- **Legacy**: JNI has been the standard mechanism for Java-native interoperability since JDK 1.1.
- **Broad Support**: Supports calling functions in shared libraries, accessing native memory, and invoking methods back into Java.
- **Complexity**: Requires detailed knowledge of C/C++ and can be cumbersome with boilerplate code.
- **Performance**: Offers good performance but can be error-prone with memory management issues.

**Example**:
```java
public class Example {
    static {
        System.loadLibrary("nativeLib");
    }

    public native void nativeMethod();

    public static void main(String[] args) {
        new Example().nativeMethod();
    }
}
```
### Foreign Function & Memory API (FFM API)

**Purpose**:
- Provides a more modern, safer, and easier-to-use way for Java programs to interact with native code and memory.

**Key Features**:
- **Simplicity**: Designed to be easier to use with cleaner syntax and less boilerplate than JNI.
- **Safety**: Incorporates safety mechanisms to reduce risks like memory leaks and buffer overflows.
- **Performance**: Comparable or better performance than JNI and sun.misc.Unsafe.
- **Direct Memory Access**: Allows safe access to foreign memory, improving data manipulation efficiency.

**Example**:
```java
import java.lang.foreign.*;

public class Example {
    public static void main(String[] args) {
        Arena arena = Arena.attached();
        MemorySegment segment = arena.allocateSegment(10, MemoryLayouts.JAVA_INT);
        ForeignFunction f = arena.getFunction("myNativeFunction", MemoryLayouts.JAVA_INT, MemoryLayouts.JAVA_INT);
        int result = f.call(segment);
        System.out.println("Result: " + result);
    }
}
```

### Comparison

**Ease of Use**:
- **JNI**: More complex with extensive boilerplate code and a steeper learning curve.
- **FFM API**: Simpler and cleaner, reducing boilerplate and improving readability.

**Safety**:
- **JNI**: Requires careful management of native resources, prone to errors like memory leaks.
- **FFM API**: Incorporates safety features to manage native resources better, reducing common pitfalls.

**Performance**:
- **JNI**: Offers good performance but can suffer from overhead due to JNI calls.
- **FFM API**: Comparable or potentially better performance, designed for efficient interaction with native code and memory.

**Use Cases**:
- **JNI**: Suitable for legacy codebases and scenarios where detailed control over native interactions is needed.
- **FFM API**: Ideal for modern applications requiring safe and efficient access to native libraries and memory.

### Summary
While both JNI and the FFM API serve similar purposes of enabling interoperability between Java and native code, the FFM API aims to modernize and simplify the process with enhanced safety and ease of use. It offers a more developer-friendly alternative to JNI, making it suitable for new projects and modern Java applications.

I hope this comparison helps! Let me know if you have any more questions or need further details.
     */
}
