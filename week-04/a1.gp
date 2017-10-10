{
  groupOfUnits(n) =
    print("The group of units mod ", n, ": ");
    for (a = 1, n-1, if (gcd(a,n) == 1, print(a, " ")));
    print("The order of the elements in the group of units mod ", n, ": ");
    for(a = 1, n-1, if(gcd(a,n) == 1, print(a, " : ", znorder(Mod(a,n)))));
    return(1);
}

{
  primeTest(n) =
    print("Starting n = ", n);
    while(Mod(2,n)^(n-1) != Mod(1,n), print(n, " ", Mod(2,n)^(n-1)); n = n+1);
    print(n, " ", Mod(2,n)^(n-1));
    print("It looks highly probable that ", n, " is prime. But we need to check it...");
    if(isprime(n) == 1, print(n, " is prime"));
    return(1);
}
