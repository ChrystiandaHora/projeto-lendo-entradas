
   System.out.println("\n \n -------------------------");
   int numero1;
   System.out.println("Informe um valor : ");
   Scanner n2 = new Scanner(System.in);
    numero1 = n2.nextInt();

    int numero2;
    System.out.println("Informe outro valor difetente do anterior : ");
    Scanner nu = new Scanner(System.in);
    numero2 = nu.nextInt();

    if(numero1 > numero2){
    System.out.println("Esse é o maior valor : " + numero1);
    }else{
    System.out.println("Esse é o maior valor : " + numero2);}
    }