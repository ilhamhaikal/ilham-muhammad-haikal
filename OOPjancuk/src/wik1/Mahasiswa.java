/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wik1;

/**
 *
 * @author user
 */
public class Mahasiswa {
    private String name;
    private String address;
    private String nrp;
    private int age;

    public Mahasiswa() {
    }

    public Mahasiswa(String name, String address, String nrp, int age) {
        this.name = name;
        this.address = address;
        this.nrp = nrp;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "name=" + name + ", address=" + address + ", nrp=" + nrp + ", age=" + age + '}';
    }
    
}
