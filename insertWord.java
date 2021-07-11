public class insertWord{
    public static void main(String[] args){
        //Mendefinisikan Objek Beserta Nilainya
        StringBuffer data = new StringBuffer("Saya sedang belajar struktur data");
        
        //Menyisipkan Karakter pada Objek StringBuffer
        data.insert(12, " ");
        data.insert(13, "p");
        data.insert(14, "e");
        data.insert(15, "r");
        data.insert(16, "g");
        data.insert(17, "i");
        data.insert(18, " ");
        //Menampilkan Output
        System.out.println(data);
    }
}