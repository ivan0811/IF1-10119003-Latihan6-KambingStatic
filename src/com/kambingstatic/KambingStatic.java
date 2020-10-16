package com.kambingstatic;

/*
	NAMA = Ivan Faathirza
	KELAS = IF1
	NIM = 10119003
	Deskripsi program = program ini untuk mengakses variabel static string dan variabel static int
	yang berada di class Mamalia lalu mengubah dan menampilkan ke layar
 */

public class KambingStatic {

    public static final String NAMA_KAMBING = "MIDUN";

    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "+Mamalia.jumlahKambing);
    }
}
