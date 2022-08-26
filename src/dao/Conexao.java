package dao;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexao {
    
    public Connection getConexao(){
        
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/kozuki_education","root","0mY5sQl9");
        }catch(Exception e){
            throw new RuntimeException("Erro - getConexao: " + e);
        }
    }
}
