/*
 * MIT License
 *
 * Copyright (c) 2022 Geekific (https://www.youtube.com/c/Geekific)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice, Geekific's channel link and this permission notice
 * shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package patronesdiseno.conductuales.memento;

public class MainApp {

    //Memento pattern lets you save and restore the state of an object without revealing the details of its implementarion.
    //To do so, this pattern makes full copies of an objects's state.
    //It delegates the creation of the object's state snapshot to the object itself, which make the original object's data safe and secure, as no other object can read or have access the snapshot data

    //En nuestro caso para editar un cuadro de texto debemos ir sacando fotos instantáneas(snapshots) cada vez q escribimos una palabra, por si queremos volver atrás con el boton deshacer poder ocupar esttas fotos instantáneas.
    //Sucede q por ejemplo los snapshots podrían no solo involucrar al texto, sino a la fuente si es que esta esta definida en el objeto, por ejemplo con
    //class TextArea{
    // private String text
    // private boolean bold;
    // private boolean italic;
    // private boolean underline;
    // private Alignment alignment;

    // }
    //En este ejemplo para tomar un snapshot podríamos hacerlo desde fuera con una clase llamada Snapshot, sin embargo no podríamos acceder a ella ya que esta encapsulada con private (TODO Aca me asalta la duda de por qué no podría hacerse esto con un setter en TextArea y luego instanciando TextArea en clase Snapshot!!)
    /*
     * Video Reference: https://youtu.be/_Q5rXfGuyLQ
     */
    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.write("Like and");
        editor.printText();
        editor.write("Like and Subscribe");
        editor.printText();
        editor.write("Like and Subscribe to Geekific!");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();

    }

}
