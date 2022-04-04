/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguye
 */
public class Connect {
    public static List<KhachHang> findKH() {
       List<KhachHang> KhachHangList = new ArrayList<>();
    Connection con =null;
    Statement st =null; 
        try {
            String Url= "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con =DriverManager.getConnection(Url);
            String sql = "select * from KhachHang";
            st=con.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                KhachHang kh=new KhachHang(rs.getString("IDKH")
                                   ,rs.getString("TenKH")
                                   ,rs.getString("DiaChi")
                                   ,rs.getString("SDT"));
                
                KhachHangList.add(kh);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
           finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return KhachHangList; 
    }
    public static List<KhoVT> findKho() {
       List<KhoVT> KhoVTList = new ArrayList<>();
    Connection con =null;
    Statement st =null; 
        try {
            String Url= "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con =DriverManager.getConnection(Url);
            String sql = "select IDKho, v.IDVT,Ten,SL from Kho k,VatTu v Where k.IDVT=v.IDVT";
            st=con.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                KhoVT k=new KhoVT(rs.getString("IDKho")
                                    ,rs.getString("IDVT")
                                   ,rs.getString("Ten")
                                   ,rs.getInt("SL"));
                
                KhoVTList.add(k);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
           finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return KhoVTList; 
    }
    public static List<NhaCungCap> findNCC() {
       List<NhaCungCap> NhaCungCapList = new ArrayList<>();
    Connection con =null;
    Statement st =null; 
        try {
            String Url= "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con =DriverManager.getConnection(Url);
            String sql = "select * from NhaCungCap";
            st=con.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                NhaCungCap NCC=new NhaCungCap(rs.getString("IDNCC")
                                   ,rs.getString("TenNCC")
                                   ,rs.getString("DiaChi")
                                   ,rs.getString("SDT"));
                
                NhaCungCapList.add(NCC);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
           finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return NhaCungCapList; 
    }
    public static List<VatTu> findVT() {
       List<VatTu> VatTuList = new ArrayList<>();
    Connection con =null;
    Statement st =null; 
        try {
            String Url= "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con =DriverManager.getConnection(Url);
            String sql = "select * from VatTu";
            st=con.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                VatTu vt=new VatTu(rs.getString("IDVT")
                                   ,rs.getString("Ten")
                                   ,rs.getString("DVT"));
                
                VatTuList.add(vt);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
           finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return VatTuList; 
    }
    public static void insertVT (VatTu vt){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "insert into VatTu(IDVT,Ten,DVT) values(?,?,?)";
            statement = con.prepareCall(sql);
            statement.setString(1,vt.getIDVT());
            statement.setString(2,vt.getTen());
            statement.setString(3,vt.getDVT());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void updateVT (VatTu vt){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName = VatTu1;user = sa;password = sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "update VatTu set IDVT=?,Ten=?,DVT=? where IDVT =?";
            statement = con.prepareCall(sql);
            statement.setString(1,vt.getIDVT());
            statement.setString(2,vt.getTen());
            statement.setString(3,vt.getDVT());
            statement.setString(4,vt.getIDVT());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public static void deleteVT(String IDVT){
        Connection con= null;
        PreparedStatement statement = null;
         String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
        try {
            con = DriverManager.getConnection(dbURL);
            String sql="delete from VatTu where IDVT= ?";
            statement =con.prepareCall(sql);
            
               statement.setString(1, IDVT);
               
               statement.execute();
        }  catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
    }
}
        public static List<VatTu> findVatTu(String ten) {
        List<VatTu> VatTuList =new ArrayList<>();
        Connection con = null;
        PreparedStatement st=null;
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con = DriverManager.getConnection(dbURL);
            String sql="SELECT * FROM VatTu where Ten like ? ";
            st=con.prepareCall(sql);
            st.setString(1, "%"+ten+"%");
            ResultSet rs=st.executeQuery();
            while (rs.next()){
                VatTu vt = new VatTu(rs.getString("IDVT")
                                    ,rs.getString("Ten")
                                    ,rs.getString("DVT") ); 
                                    
                VatTuList.add(vt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return VatTuList;
    }
    public static void insertNCC (NhaCungCap ncc){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "insert into NhaCungCap(IDNCC,TenNCC,DiaChi,SDT) values(?,?,?,?)";
            statement = con.prepareCall(sql);
            statement.setString(1,ncc.getIDNCC());
            statement.setString(2,ncc.getTenNCC());
            statement.setString(3,ncc.getDiaChi());
            statement.setString(4,ncc.getSDT());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public static void deleteNCC(String IDNCC){
        Connection con= null;
        PreparedStatement statement = null;
         String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
        try {
            con = DriverManager.getConnection(dbURL);
            String sql="delete from NhaCungCap where IDNCC= ?";
            statement =con.prepareCall(sql);
            
               statement.setString(1, IDNCC);
               
               statement.execute();
        }  catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
    }
}
    public static void updateNCC(NhaCungCap NCC){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName = VatTu1;user = sa;password = sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "update NhaCungCap set IDNCC=?,TenNCC=?,DiaChi=?,SDT=? where IDNCC =?";
            statement = con.prepareCall(sql);
            statement.setString(1,NCC.getIDNCC());
            statement.setString(2,NCC.getTenNCC());
            statement.setString(3,NCC.getDiaChi());
            statement.setString(4,NCC.getSDT());
            statement.setString(5,NCC.getIDNCC());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public static List<NhaCungCap> findNCC(String ten) {
        List<NhaCungCap> NhaCungCapList =new ArrayList<>();
        Connection con = null;
        PreparedStatement st=null;
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con = DriverManager.getConnection(dbURL);
            String sql="SELECT * FROM NhaCungCap where TenNCC like ? ";
            st=con.prepareCall(sql);
            st.setString(1, "%"+ten+"%");
            ResultSet rs=st.executeQuery();
            while (rs.next()){
                NhaCungCap NCC = new NhaCungCap(rs.getString("IDNCC")
                                    ,rs.getString("TenNCC")
                                    ,rs.getString("DiaChi")
                                    ,rs.getString("SDT")); 
                                    NhaCungCapList.add(NCC);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return NhaCungCapList;
    }
    public static void insertKH (KhachHang kh){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "insert into KhachHang(IDKH,TenKH,DiaChi,SDT) values(?,?,?,?)";
            statement = con.prepareCall(sql);
            statement.setString(1,kh.getIDKH());
            statement.setString(2,kh.getTenKH());
            statement.setString(3,kh.getDiaChi());
            statement.setString(4,kh.getSDT());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public static void deleteKH(String IDKH){
        Connection con= null;
        PreparedStatement statement = null;
         String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
        try {
            con = DriverManager.getConnection(dbURL);
            String sql="delete from KhachHang where IDKH= ?";
            statement =con.prepareCall(sql);
            
               statement.setString(1, IDKH);
               
               statement.execute();
        }  catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
    }
}
     public static void updateKH(KhachHang kh){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName = VatTu1;user = sa;password = sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "update KhachHang set IDKH=?,TenKH=?,DiaChi=?,SDT=? where IDKH =?";
            statement = con.prepareCall(sql);
            statement.setString(1,kh.getIDKH());
            statement.setString(2,kh.getTenKH());
            statement.setString(3,kh.getDiaChi());
            statement.setString(4,kh.getSDT());
            statement.setString(5,kh.getIDKH());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
     public static List<KhachHang> FindKH(String ten) {
        List<KhachHang> KhachHangList =new ArrayList<>();
        Connection con = null;
        PreparedStatement st=null;
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con = DriverManager.getConnection(dbURL);
            String sql="SELECT * FROM KhachHang where TenKH like ? ";
            st=con.prepareCall(sql);
            st.setString(1, "%"+ten+"%");
            ResultSet rs=st.executeQuery();
            while (rs.next()){
                KhachHang kh = new KhachHang(rs.getString("IDKH")
                                    ,rs.getString("TenKH")
                                    ,rs.getString("DiaChi")
                                    ,rs.getString("SDT")); 
                                    KhachHangList.add(kh);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return KhachHangList;
    }
    public static List<NhanVien> findNV() {
       List<NhanVien> NhanVienList = new ArrayList<>();
    Connection con =null;
    Statement st =null; 
        try {
            String Url= "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con =DriverManager.getConnection(Url);
            String sql = "select * from NhanVien";
            st=con.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                NhanVien nv=new NhanVien(rs.getString("IDNV")
                                   ,rs.getString("TenNV")
                                   ,rs.getString("GioiTinh")
                                   ,rs.getString("NgaySinh")
                                   ,rs.getString("DiaChi")
                                   ,rs.getString("SDT"));
                
                NhanVienList.add(nv);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
           finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return NhanVienList; 
    }
    public static void insertNV (NhanVien nv){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "insert into NhanVien(IDNV,TenNV,GioiTinh,NgaySinh,DiaChi,SDT) values(?,?,?,?,?,?)";
            statement = con.prepareCall(sql);
            statement.setString(1,nv.getIDNV());
            statement.setString(2,nv.getTenNV());
            statement.setString(3,nv.getGioiTinh());
            statement.setString(4,nv.getNgaySinh());
            statement.setString(5,nv.getDiaChi());           
            statement.setString(6,nv.getSDT());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
                    public static void deleteNV(String IDNV){
        Connection con= null;
        PreparedStatement statement = null;
         String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
        try {
            con = DriverManager.getConnection(dbURL);
            String sql="delete from NhanVien where IDNV= ?";
            statement =con.prepareCall(sql);
            
               statement.setString(1, IDNV);
               
               statement.execute();
        }  catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
    }
}
    public static void updateNV(NhanVien nv){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName = VatTu1;user = sa;password = sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "update NhanVien set IDNV=?,TenNV=?,GioiTinh=?,NgaySinh=?,DiaChi=?,SDT=? where IDNV =?";
            statement = con.prepareCall(sql);
            statement.setString(1,nv.getIDNV());
            statement.setString(2,nv.getTenNV());
            statement.setString(3,nv.getGioiTinh());
            statement.setString(4,nv.getNgaySinh());
            statement.setString(5,nv.getDiaChi());
            statement.setString(6,nv.getSDT());
            statement.setString(7,nv.getIDNV());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public static List<NhanVien> FindNV(String ten) {
        List<NhanVien> NhanVienList =new ArrayList<>();
        Connection con = null;
        PreparedStatement st=null;
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con = DriverManager.getConnection(dbURL);
            String sql="SELECT * FROM NhanVien where TenNV like ? ";
            st=con.prepareCall(sql);
            st.setString(1, "%"+ten+"%");
            ResultSet rs=st.executeQuery();
            while (rs.next()){
               NhanVien nv = new NhanVien(rs.getString("IDNV")
                                    ,rs.getString("TenNV")
                                    ,rs.getString("GioiTinh")
                                    ,rs.getString("NgaySinh")
                                    ,rs.getString("DiaChi")
                                    ,rs.getString("SDT")); 
                                    NhanVienList.add(nv);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return NhanVienList;
    }
    public static List<HDNhap> findAllHDN() {
       List<HDNhap> HDNhapList = new ArrayList<>();
    Connection con =null;
    Statement st =null; 
        try {
            String Url= "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con =DriverManager.getConnection(Url);
            String sql = "select IDHDN,h.IDNCC,h.IDNV,TenNCC,NgayLapHD,TenNV from HoaDonNhap h ,NhanVien n ,NhaCungCap c where h.IDNV=n.IDNV and h.IDNCC=c.IDNCC";
            st=con.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                HDNhap hdn=new HDNhap( rs.getString("IDHDN")
                                        ,rs.getString("IDNCC")
                                        ,rs.getString("IDNV")
                                        ,rs.getString("TenNCC")
                                        ,rs.getString("NgayLapHD")
                                        ,rs.getString("TenNV"));
                
                HDNhapList.add(hdn);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
           finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return HDNhapList; 
    }
    public static void insertHDN (HDNhap hdn){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "insert into HoaDonNhap(IDHDN,IDNCC,IDNV,NgayLapHD) values(?,?,?,?)";
            statement = con.prepareCall(sql);
            statement.setString(1,hdn.getIDHDN());
            statement.setString(2,hdn.getIDNCC());
            statement.setString(3,hdn.getIDNV());
            statement.setString(4,hdn.getNgayLapHD());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
                   public static void deleteHDN(String IDHDN){
        Connection con= null;
        PreparedStatement statement = null;
         String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
        try {
            con = DriverManager.getConnection(dbURL);
            String sql="delete from HoaDonNhap where IDHDN= ?";
            statement =con.prepareCall(sql);
            
               statement.setString(1, IDHDN);
               
               statement.execute();
        }  catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
    }
}
    public static void updateHDN(HDNhap hdn) {
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName = VatTu1;user = sa;password = sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "update HoaDonNhap set IDHDN=?,IDNCC=?,IDNV=?,NgayLapHD=? where IDHDN=?";
            statement = con.prepareCall(sql);
            statement.setString(1,hdn.getIDHDN());
            statement.setString(2,hdn.getIDNCC());
            statement.setString(3,hdn.getIDNV());
            statement.setString(4,hdn.getNgayLapHD());
            statement.setString(5,hdn.getIDHDN());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public static List<HDNhap> FindHDN(String IDHDN) {
        List<HDNhap> HDNhapList =new ArrayList<>();
        Connection con = null;
        PreparedStatement st=null;
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con = DriverManager.getConnection(dbURL);
            String sql="select IDHDN,h.IDNCC,h.IDNV,TenNCC,NgayLapHD,TenNV from HoaDonNhap h ,NhanVien n ,NhaCungCap c where h.IDNV=n.IDNV and h.IDNCC=c.IDNCC and IDHDN like ? ";
            st=con.prepareCall(sql);
            st.setString(1, "%"+IDHDN+"%");
            ResultSet rs=st.executeQuery();
            while (rs.next()){
               HDNhap hdn = new HDNhap(rs.getString("IDHDN")
                                    ,rs.getString("IDNCC")
                                    ,rs.getString("IDNV")
                                    ,rs.getString("TenNCC")
                                    ,rs.getString("NgayLapHD")
                                    ,rs.getString("TenNV")); 
                                    HDNhapList.add(hdn);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return HDNhapList;
    }
  public static boolean DangNhap(User u){
                 Connection con =null;
    PreparedStatement st =null; 
        try {
            String Url= "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName = VatTu1;user = sa;password = sa";
            con =DriverManager.getConnection(Url);
            String sql = "select * from NguoiDung where UserName=? and PassWord=?";
            st=con.prepareCall(sql);
            st.setString(1,u.getUserName());
            st.setString(2, u.getPassWord());
           
            
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return true;       
            }
            else{
                 return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
           finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
   /* public static List<cthdn> findAllCTHDN() {
       List<cthdn> ctnList = new ArrayList<>();
    Connection con =null;
    Statement st =null; 
        try {
            String Url= "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con =DriverManager.getConnection(Url);
            String sql = "select ID,cthdn.IDVT,cthdn.IDHDN,Ten,DVT,NgayLapHD,SLN,GiaNhap, SLN*GiaNhap as ThanhTien from HoaDonNhap h ,VatTu v,ChiTietHoaDonNhap cthdn  where cthdn.IDVT=v.IDVT and cthdn.IDHDN=h.IDHDN";
            st=con.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                cthdn ctn=new cthdn( rs.getInt("ID")
                                        ,rs.getString("IDVT")
                                        ,rs.getString("IDHDN")
                                        ,rs.getString("Ten")
                                        ,rs.getString("DVT")
                                        ,rs.getString("NgayLapHD")
                                        ,rs.getInt("SLN")
                                        ,rs.getInt("GiaNhap")
                                        ,rs.getInt("ThanhTien"));
                
                ctnList.add(ctn);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
           finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ctnList; 
    }*/
    public static void insertCTHDN (cthdn ctn){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "insert into ChiTietHoaDonNhap(ID,IDVT,IDHDN,SLN,GiaNhap) values(?,?,?,?,?)";
            statement = con.prepareCall(sql);
            statement.setInt(1,ctn.getID());
            statement.setString(2,ctn.getIDVT());
            statement.setString(3,ctn.getIDHDN());
            statement.setInt(4,ctn.getSLN());
            statement.setInt(5,ctn.getGiaNhap());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public static void deleteCTHDN(int ID){
        Connection con= null;
        PreparedStatement statement = null;
         String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
        try {
            con = DriverManager.getConnection(dbURL);
            String sql="delete from ChiTietHoaDonNhap where ID= ?";
            statement =con.prepareCall(sql);
            
               statement.setInt(1, ID);
               
               statement.execute();
        }  catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
    }
}
    public static void updateCTHDN(cthdn ctn) {
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName = VatTu1;user = sa;password = sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "update ChiTietHoaDonNhap set ID=?,IDVT=?,IDHDN=?,SLN=?,GiaNhap=? where ID=?";
            statement = con.prepareCall(sql);
            statement.setInt(1,ctn.getID());
            statement.setString(2,ctn.getIDVT());
            statement.setString(3,ctn.getIDHDN());
            statement.setInt(4,ctn.getSLN());
            statement.setInt(5,ctn.getGiaNhap());
            statement.setInt(6,ctn.getID());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public static List<cthdn> FindCTHDN(String IDHDN) {
        List<cthdn> ctnList =new ArrayList<>();
        Connection con = null;
        PreparedStatement st=null;
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con = DriverManager.getConnection(dbURL);
            String sql="select ID,cthdn.IDVT,cthdn.IDHDN,Ten,DVT,NgayLapHD,SLN,GiaNhap, SLN*GiaNhap as ThanhTien from HoaDonNhap h ,VatTu v,ChiTietHoaDonNhap cthdn  where cthdn.IDVT=v.IDVT and cthdn.IDHDN=h.IDHDN and cthdn.IDHDN like ? ";
            st=con.prepareCall(sql);
            st.setString(1, "%"+IDHDN+"%");
            ResultSet rs=st.executeQuery();
            while (rs.next()){
               cthdn ctn = new cthdn(rs.getInt("ID")
                                    ,rs.getString("IDVT")
                                    ,rs.getString("IDHDN")
                                    ,rs.getString("Ten")
                                    ,rs.getString("DVT")
                                    ,rs.getString("NgayLapHD")
                                    ,rs.getInt("SLN")
                                    ,rs.getInt("GiaNhap")
                                    ,rs.getInt("ThanhTien")); 
                                    ctnList.add(ctn);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ctnList;
    }
    public static List<HDXuat> findAllHDX() {
       List<HDXuat> HDXuatList = new ArrayList<>();
    Connection con =null;
    Statement st =null; 
        try {
            String Url= "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con =DriverManager.getConnection(Url);
            String sql = "select IDHDX,h.IDKH,h.IDNV,TenKH,NgayLapHDXuat,TenNV from HoaDonXuat h ,NhanVien n ,khachhang k where h.IDNV=n.IDNV and h.IDKH=k.IDKH";
            st=con.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                HDXuat hdx=new HDXuat( rs.getString("IDHDX")
                                        ,rs.getString("IDKH")
                                        ,rs.getString("IDNV")
                                        ,rs.getString("TenKH")
                                        ,rs.getString("NgayLapHDXuat")
                                        ,rs.getString("TenNV"));
                
                HDXuatList.add(hdx);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
           finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return HDXuatList; 
    }
    public static void insertHDX (HDXuat hdx){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "insert into HoaDonXuat(IDHDX,IDKH,IDNV,NgayLapHDXuat) values(?,?,?,?)";
            statement = con.prepareCall(sql);
            statement.setString(1,hdx.getIDHDX());
            statement.setString(2,hdx.getIDKH());
            statement.setString(3,hdx.getIDNV());
            statement.setString(4,hdx.getNgayLapHDXuat());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public static void deleteHDX(String IDHDX){
        Connection con= null;
        PreparedStatement statement = null;
         String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
        try {
            con = DriverManager.getConnection(dbURL);
            String sql="delete from HoaDonXuat where IDHDX= ?";
            statement =con.prepareCall(sql);
            
               statement.setString(1, IDHDX);
               
               statement.execute();
        }  catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
    }
}
    public static void updateHDX(HDXuat hdx) {
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName = VatTu1;user = sa;password = sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "update HoaDonXuat set IDHDX=?,IDKH=?,IDNV=?,NgayLapHDXuat=? where IDHDX=?";
            statement = con.prepareCall(sql);
            statement.setString(1,hdx.getIDHDX());
            statement.setString(2,hdx.getIDKH());
            statement.setString(3,hdx.getIDNV());
            statement.setString(4,hdx.getNgayLapHDXuat());
            statement.setString(5,hdx.getIDHDX());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public static List<HDXuat> FindHDX(String IDHDX) {
        List<HDXuat> HDXuatList =new ArrayList<>();
        Connection con = null;
        PreparedStatement st=null;
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con = DriverManager.getConnection(dbURL);
            String sql="select IDHDX,h.IDKH,h.IDNV,TenKH,NgayLapHDXuat,TenNV from HoaDonXuat h ,NhanVien n ,khachhang k where h.IDNV=n.IDNV and h.IDKH=k.IDKH and IDHDX like ? ";
            st=con.prepareCall(sql);
            st.setString(1, "%"+IDHDX+"%");
            ResultSet rs=st.executeQuery();
            while (rs.next()){
               HDXuat hdx = new HDXuat(rs.getString("IDHDX")
                                    ,rs.getString("IDKH")
                                    ,rs.getString("IDNV")
                                    ,rs.getString("TenKH")
                                    ,rs.getString("NgayLapHDXuat")
                                    ,rs.getString("TenNV")); 
                                    HDXuatList.add(hdx);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return HDXuatList;
    }
    public static void insertCTHDX (cthdx ctx){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "insert into ChiTietHoaDonXuat(IDX,IDKho,IDHDX,SLX,DGX) values(?,?,?,?,?)";
            statement = con.prepareCall(sql);
            statement.setInt(1,ctx.getIDX());
            statement.setString(2,ctx.getIDKho());
            statement.setString(3,ctx.getIDHDX());
            statement.setInt(4,ctx.getSLX());
            statement.setInt(5,ctx.getDGX());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public static void deleteCTHDX(int IDX){
        Connection con= null;
        PreparedStatement statement = null;
         String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
        try {
            con = DriverManager.getConnection(dbURL);
            String sql="delete from ChiTietHoaDonXuat where IDX= ?";
            statement =con.prepareCall(sql);
            
               statement.setInt(1, IDX);
               
               statement.execute();
        }  catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
    }
}
    public static void updateCTHDX(cthdx ctx) {
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName = VatTu1;user = sa;password = sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "update ChiTietHoaDonXuat set IDX=?,IDKho=?,IDHDX=?,SLX=?,DGX=? where IDX=?";
            statement = con.prepareCall(sql);
            statement.setInt(1,ctx.getIDX());
            statement.setString(2,ctx.getIDKho());
            statement.setString(3,ctx.getIDHDX());
            statement.setInt(4,ctx.getSLX());
            statement.setInt(5,ctx.getDGX());
            statement.setInt(6,ctx.getIDX());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
        public static List<cthdx> FindCTHDX(String IDHDX) {
        List<cthdx> ctxList =new ArrayList<>();
        Connection con = null;
        PreparedStatement st=null;
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con = DriverManager.getConnection(dbURL);
            String sql="select IDX,cthdx.IDKho,cthdx.IDHDX,k.IDVT,Ten,DVT,TenKH,SDT,DiaChi,NgayLapHDXuat,k.SL,SLX,DGX, SLX*DGX as ThanhTien from khachhang kh, VatTu v, HoaDonXuat h ,Kho k,ChiTietHoaDonXuat cthdx  where cthdx.IDKho=k.IDKho and cthdx.IDHDX=h.IDHDX and h.IDKH=kh.IDKH and k.IDVT=v.IDVT  and cthdx.IDHDX like ?";
            st=con.prepareCall(sql);
            st.setString(1, "%"+IDHDX+"%");
            ResultSet rs=st.executeQuery();
            while (rs.next()){
               cthdx ctx = new cthdx(rs.getInt("IDX")
                                    ,rs.getString("IDKho")
                                    ,rs.getString("IDHDX")
                                    ,rs.getString("IDVT")
                                    ,rs.getString("Ten")
                                    ,rs.getString("DVT")
                                    ,rs.getString("TenKH")
                                    ,rs.getString("SDT")
                                    ,rs.getString("DiaChi")
                                    ,rs.getString("NgayLapHDXuat")
                                    ,rs.getInt("SL")
                                    ,rs.getInt("SLX")
                                    ,rs.getInt("DGX")
                                    ,rs.getInt("ThanhTien")); 
                                    ctxList.add(ctx);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ctxList;
    }
    public static void updateKho (KhoVT k){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName = VatTu1;user = sa;password = sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "update Kho set IDKho=?,IDVT=?,SL=? where IDKho =?";
            statement = con.prepareCall(sql);
            statement.setString(1,k.getIDKho());
            statement.setString(2,k.getIDVT());
            statement.setInt(3,k.getSL());
            statement.setString(4,k.getIDKho());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void insertKho (KhoVT k){
    Connection con=null;
    PreparedStatement statement = null;
    String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
    
        try {
            con =DriverManager.getConnection(dbURL);
            String sql = "insert into Kho(IDKho,IDVT,SL) values(?,?,?)";
            statement = con.prepareCall(sql);
            statement.setString(1,k.getIDKho());
            statement.setString(2,k.getIDVT());
            statement.setInt(3,k.getSL());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally {
           
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
            
        public static void deleteKho(String IDKho){
        Connection con= null;
        PreparedStatement statement = null;
         String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
        try {
            con = DriverManager.getConnection(dbURL);
            String sql="delete from Kho where IDKho= ?";
            statement =con.prepareCall(sql);
            
               statement.setString(1, IDKho);
               
               statement.execute();
        }  catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
    }
}
        public static List<KhoVT> findKho(String IDKho) {
        List<KhoVT> KhoList =new ArrayList<>();
        Connection con = null;
        PreparedStatement st=null;
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con = DriverManager.getConnection(dbURL);
            String sql="SELECT IDKho,k.IDVT,Ten,SL FROM Kho k,VatTu v where IDKho like ? and k.IDVT=v.IDVT";
            st=con.prepareCall(sql);
            st.setString(1, "%"+IDKho+"%");
            ResultSet rs=st.executeQuery();
            while (rs.next()){
                KhoVT k = new KhoVT(rs.getString("IDKho")
                                    ,rs.getString("IDVT")
                                    ,rs.getString("Ten")
                                    ,rs.getInt("SL") ); 
                                    
                KhoList.add(k);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return KhoList;
    }
        public static List<HangTon> findHT() {
        List<HangTon> HTList =new ArrayList<>();
        Connection con = null;
        PreparedStatement st=null;
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-99PF9FI;databaseName=VatTu1;user=sa;password=sa";
            con = DriverManager.getConnection(dbURL);
            String sql="SELECT IDKho,Ten,SL FROM Kho k , VatTu v where k.IDVT=v.IDVT  ";
            st=con.prepareCall(sql);
            ResultSet rs=st.executeQuery();
            while (rs.next()){
                HangTon ht = new HangTon(rs.getString("IDKho")
                                    ,rs.getString("Ten")
                                    ,rs.getInt("SL") ); 
                                    
                HTList.add(ht);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(st!=null){
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con !=null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return HTList;
    }          
}
