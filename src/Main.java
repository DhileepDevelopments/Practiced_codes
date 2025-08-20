class main{
    public static void main(String[] args){
        int i;
        int j;
        int n=5;
        int count=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(count<0)
                {
                    System.out.printf("%03d",j);

                }
                else if(count>=0 && count < 10)
                {
                    System.out.printf(" "+"%02d",count);
                }
                else {
                    System.out.print(" "+count);
                }
                count++;
            }
            System.out.println();
        }

    }
}
