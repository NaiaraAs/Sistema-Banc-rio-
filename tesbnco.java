public static void main(String[] args) {
    Banco bradesco = new Banco();
  
  bradesco.setTitular("Mauro");
  bradesco.setNumeroConta("123.456.789-11");
  bradesco.setAgencia("001-01");
  bradesco.mostrarDados();
  bradesco.Sacar(100);
  bradesco.Deposito(100);
  bradesco.Rendimento(0.05);
  System.out.println();
  System.out.println("Agencia: "+ bradesco.getAgencia());
  System.out.println("Titular: "+bradesco.getTitular());
  System.out.println("Numero Conta: "+bradesco.getNumeroConta());
  
  
  
  }
  
  }
