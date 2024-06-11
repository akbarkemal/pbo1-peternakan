/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author acer
 */
public class koneksi {
    private String databasename = "2210010419";
    private String username = "root";
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/"+databasename;
    public static Connection koneksidb;
    
    public koneksi(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksidb = DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database terkoneksi");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //untuk tabel peternak
    public void simpanpeternak(int idPeternak, String nmPeternak , String Alamat, String Email, String Password){
        
        try {
            String sql = "insert into peternak(id_peternak, nm_peternak, alamat, email, password) value (?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idPeternak);
            perintah.setString(2, nmPeternak);
            perintah.setString(3, Alamat);
            perintah.setString(4, Email);
            perintah.setString(5, Password);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk tabel peternak
    public void ubahpeternak(int idPeternak, String nmPeternak , String Alamat, String Email, String Password){
        
        try {
            String sql = "update peternak set nm_peternak = ?, alamat = ?, email = ?, password = ? where id_peternak = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, nmPeternak);
            perintah.setString(2, Alamat);
            perintah.setString(3, Email);
            perintah.setString(4, Password);
            perintah.setInt(5, idPeternak);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk tabel peternak
    public void hapuspeternak(int idPeternak){
        
        try {
            String sql = "delete from peternak where id_peternak = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idPeternak);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk tabel tanya
    public void simpantanya(int idTanya, int idPenanya , String Pertanyaan, String Kategori, String Waktu, String Status){
        
        try {
            String sql = "insert into tanya(id_tanya, id_penanya, pertanyaan, kategori, waktu, status) value (?,?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idTanya);
            perintah.setInt(2, idPenanya);
            perintah.setString(3, Pertanyaan);
            perintah.setString(4, Kategori);
            perintah.setString(5, Waktu);
            perintah.setString(6, Status);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk tabel tanya
    public void ubahtanya(int idTanya, int idPenanya , String Pertanyaan, String Kategori, String Waktu, String Status){
        
        try {
            String sql = "update tanya set id_penanya = ?, pertanyaan = ?, kategori = ?, waktu = ?, status = ? where id_tanya = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idPenanya);
            perintah.setString(2, Pertanyaan);
            perintah.setString(3, Kategori);
            perintah.setString(4, Waktu);
            perintah.setString(5, Status);
            perintah.setInt(6, idTanya);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk tabel tanya
    public void hapustanya(int idTanya){
        
        try {
            String sql = "delete from tanya where id_tanya = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idTanya);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk tabel penyuluh
    public void simpanpenyuluh(int idPenyuluh, String nmPenyuluh , String Alamat, String Email, String Password){
        
        try {
            String sql = "insert into penyuluh(id_penyuluh, nm_penyuluh, alamat, email, password) value (?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idPenyuluh);
            perintah.setString(2, nmPenyuluh);
            perintah.setString(3, Alamat);
            perintah.setString(4, Email);
            perintah.setString(5, Password);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk tabel penyuluh
    public void ubahpenyuluh(int idPenyuluh, String nmPenyuluh , String Alamat, String Email, String Password){
        
        try {
            String sql = "update penyuluh set nm_penyuluh = ?, alamat = ?, email = ?, password = ? where id_penyuluh = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, nmPenyuluh);
            perintah.setString(2, Alamat);
            perintah.setString(3, Email);
            perintah.setString(4, Password);
            perintah.setInt(5, idPenyuluh);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk tabel penyuluh
    public void hapuspenyuluh(int idPenyuluh){
        
        try {
            String sql = "delete from penyuluh where id_penyuluh = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idPenyuluh);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk tabel jawab
    public void simpanjawab(int idJawab, int idTanya, int idPenjawab , String Jawaban, String Waktu, String Status){
        
        try {
            String sql = "insert into jawab(id_jawab, id_tanya, id_penjawab, jawaban, waktu, status) value (?,?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idJawab);
            perintah.setInt(2, idTanya);
            perintah.setInt(3, idPenjawab);
            perintah.setString(4, Jawaban);
            perintah.setString(5, Waktu);
            perintah.setString(6, Status);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk tabel jawab
    public void ubahjawab(int idJawab, int idTanya, int idPenjawab , String Jawaban, String Waktu, String Status){
        
        try {
            String sql = "update jawab set id_tanya = ?, id_penjawab = ?, jawaban = ?, waktu = ?, status = ? where id_jawab = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idTanya);
            perintah.setInt(2, idPenjawab);
            perintah.setString(3, Jawaban);
            perintah.setString(4, Waktu);
            perintah.setString(5, Status);
            perintah.setInt(6, idJawab);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //untuk tabel jawab
    public void hapusjawab(int idJawab){
        
        try {
            String sql = "delete from jawab where id_jawab = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setInt(1, idJawab);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
    public void simpanbelajar(String tempNpm, String tempNama, String tempTelpon){
        
        try {
            String sql = "insert into belajar (npm, nama, telpon) value (?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempNpm);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempTelpon);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahbelajar(String tempNpm, String tempNama, String tempTelpon){
        
        try {
            String sql = "update belajar set nama = ?, telpon = ? where npm = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempNama);
            perintah.setString(2, tempTelpon);
            perintah.setString(3, tempNpm);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusbelajar(String tempNpm){
        
        try {
            String sql = "delete from belajar where npm = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempNpm);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    */
    
}
