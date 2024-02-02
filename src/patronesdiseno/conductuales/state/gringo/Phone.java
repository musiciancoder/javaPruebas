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

package patronesdiseno.conductuales.state.gringo;


import patronesdiseno.conductuales.state.gringo.state.OffState;
import patronesdiseno.conductuales.state.gringo.state.State;

//This is the Context Class.
//Baeldung tiene la misma estructura para el context, tutorialpoint tiene diferente estructura en el context pq solo define constrctor y setters y setters pero no métodos a ser llamados en las clases concretas como lock(), home(), etc.
//Sin embargo lo que todos (los tres proyectos) tienen en coumun es que definen metodos en funcion a state y no es un POJO que tenga defina por ejemplo atributos para el color o marca de teléfono, por lo que si necesitaramos un Pojo debieramos hacerlo en una clase diferente al context

public class Phone { //Notar que la clase

    private State state;

    public Phone() {

        state = new OffState(this);
        //Este es el estado inicial. Tutorialpoint define el estado inicial como nulo, pero es el mismo concepto
        // Stores a reference to its current concrete state
    }

    //setter pero no getter
    public void setState(State state) {

        this.state = state;
    }


    public String lock() {
        return "Locking phone and turning off the screen";
    }

    public String home() {
        return "Going to home-screen";
    }

    public String unlock() {
        return "Unlocking the phone to home";
    }

    public String turnOn() {
        return "Turning screen on, device still locked";
    }

    public String clickHome() {
        return state.onHome();
    }

    public String clickPower() {
        return state.onOffOn();
    }//Acá comienza la cosa

}

