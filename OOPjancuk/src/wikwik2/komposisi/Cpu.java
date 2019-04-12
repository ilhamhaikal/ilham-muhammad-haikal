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
public class Cpu {
 private String nama;
private Flashdisk fd;
private Mouse mouse;
private USB usb;

    public Cpu() {
    }

    public Cpu(String nama, Flashdisk fd, Mouse mouse, USB usb) {
        this.nama = nama;
        this.fd = fd;
        this.mouse = mouse;
        this.usb = usb;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Flashdisk getFd() {
        return fd;
    }

    public void setFd(Flashdisk fd) {
        this.fd = fd;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    @Override
    public String toString() {
        return "Cpu{" + "nama=" + nama + ", fd=" + fd + ", mouse=" + mouse + ", usb=" + usb + '}';
    }

}