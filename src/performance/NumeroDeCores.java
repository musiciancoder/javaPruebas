package performance;

public class NumeroDeCores {
    public static void main(String[] args) {
        System.out.println("Procesadores lógicos: " +Runtime.getRuntime().availableProcessors());
        System.out.println("Total memory: " +Runtime.getRuntime().totalMemory());
        System.out.println("Free memory: " +Runtime.getRuntime().freeMemory());
        System.out.println("Max memory: " +Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime());

    }

    /*
    De chat GTP:
    En el Administrador de tareas de Windows, los "procesadores lógicos" y los "núcleos virtuales" se refieren a conceptos relacionados pero distintos.

Procesadores Lógicos: Es una representación de la capacidad de procesamiento de tu CPU. En el contexto de los procesadores modernos, se puede usar la tecnología de Hyper-Threading de Intel o SMT (Simultaneous Multi-Threading) de AMD, que permite que cada núcleo físico ejecute múltiples hilos de ejecución simultáneamente. Esto significa que cada núcleo físico puede aparecer como varios procesadores lógicos en el Administrador de tareas.

Número de Núcleos Virtuales: Este término es más específico y generalmente se refiere a la cantidad de hilos de ejecución que están disponibles. Por ejemplo, un procesador con 4 núcleos físicos y soporte para Hyper-Threading puede tener 8 núcleos virtuales.

En resumen, los "procesadores lógicos" en el Administrador de tareas muestran la cantidad total de hilos de ejecución disponibles, que incluyen tanto los núcleos físicos como los virtuales, si tu CPU soporta tecnología de hilo simultáneo.
     */
}
