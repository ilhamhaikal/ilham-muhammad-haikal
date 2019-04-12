/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wikwik2.komposisi;

/**
 *
 * @author user
 */
public class Mouse {

private String mouse;

    public Mouse() {
    }

    public Mouse(String mouse) {
        this.mouse = mouse;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Mouse{" + "mouse=" + mouse + '}';
    }

}
