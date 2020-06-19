package DAO;


import Beans.FuncionarioBeans;
import Utilitarios.Conexao;
import Utilitarios.Corretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FuncionarioDAO {
    
    
    
    public FuncionarioDAO(){
        
    }
    
    public void cadastrarFuncionario(FuncionarioBeans Func){
        try {
           
            String SQLInsertion = "insert into funcionarios(funnome, funcargo, fundatacad) values (?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Func.getNome());
            st.setString(2, Func.getCargo());
            st.setString(3, Corretores.ConverterParaSQL(Func.getDataCad()));
                    
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));
            
        } catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
    
    public String proximoFuncionario(){
        String SQLSelection = "select * from funcionarios order by funcod desc limit 1";
        try {
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return (Integer.parseInt(rs.getString("funcod")) + 1) + "";
            }else{
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return "0";
        }
        
    }
    
    public void buscarFuncionario(String Pesquisa, DefaultTableModel Modelo){
        
        try {
            String SQLSelection = "select * from funcionarios where funnome like '%" + Pesquisa + "%' ";  
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Modelo.addRow(new Object[] {rs.getString("funcod"), rs.getString("funnome"), rs.getString("funcargo"), rs.getString("fundatacad") } );
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Buscar Funcionario", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
       
      
    }
    
    public FuncionarioBeans PreencherCampos(int Codigo){
        FuncionarioBeans Func = new FuncionarioBeans();
         try {
            String SQLSelection = "select * from funcionarios where funcod = ?";  
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, Codigo);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
               Func.setCodigo(rs.getInt("funcod")); 
               Func.setNome(rs.getString("funnome")); 
               Func.setDataCad(Corretores.ConverterParaJava(rs.getString("fundatacad"))); 
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Buscar Cliente", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        } 
         
         return Func;
    }
    
    
    public void editarFuncionario(FuncionarioBeans Func){
        try {
           
            String SQLInsertion = "update clientes set clinome = ?, clirua = ?, clibairro = ?, clitelefone = ? where clicod = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Func.getNome());
            
            st.setInt(5, Func.getCodigo());
                    
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro editado com Sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));
            
        } catch (SQLException ex) {
          
           JOptionPane.showMessageDialog(null, "Erro ao Editar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
}
