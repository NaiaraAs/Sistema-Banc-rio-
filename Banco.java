public class Banco {
    Scanner ler = new Scanner(System.in);
    private String Titular;
    private String NumeroConta;
    private String Agencia;
    private double Saldo=1000;
    private String Data = "01/12/2000";
    
    
    public void setSaldo (Double Saldo) {
        this.Saldo = 0;
    }
    public void setTitular (String Titular) {
        this.Titular = Titular;
    }
    public void setNumeroConta (String NumeroConta) {
        this.NumeroConta = NumeroConta;
    }
    public void setAgencia (String Agencia) {
        this.Agencia = Agencia;
    }
    public String getAgencia() {
        return this.Agencia;
    }
    public String getTitular() {
        return this.Titular;
    }
    public String getNumeroConta() {
        return this.NumeroConta;
    }
    
    
    public void Sacar(double valor) {
        if (valor >= 0 && this.Saldo >= valor) {
            this.Saldo -= valor;
            System.out.println("Saque realizado. Seu Saldo agora é: "+ this.Saldo);
        }else { 
            System.out.println("Não foi possivel realizar o saque");
        }
    }
    public void Deposito(double valor) {
        if (valor >= 0) {
            this.Saldo += valor;
            System.out.println("Deposito realizado. O saldo agora é: "+this.Saldo);
        }else {
            System.out.println("Não foi possivel realizar o deposito");
        }
    }
    public void Rendimento(double valor) {
        double renda;
        renda= this.Saldo * 0.05;
        System.out.println("Seu rendimento anual foi: "+ renda);
        this.Saldo += renda;
        System.out.println("Seu saldo atual é: "+ this.Saldo);
    }
    
        
    public void mostrarDados () {
        System.out.println("Titular: "+ this.Titular);
        System.out.println("Número da Conta: " + this.NumeroConta);
        System.out.println("Agencia: "+ this.Agencia);
        System.out.println("Saldo: "+ this.Saldo);
        System.out.println("Data: "+ this.Data);
                
    } // comentario
    

    
    
    
    
}//fim class
