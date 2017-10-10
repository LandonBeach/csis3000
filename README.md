# Operating Systems (CSIS 3600)


## Week 1
1. Write a program that, given a positive integer n, prints out all the subsets of {1,2,…,n}.
1. Write a method that, given positive integer n prints all the primes less than or equal to n.
1. Using the method from #2 how long does it take to compute the primes < 10,000, 100,000 and 1 million?
1. By hand, compute the gcd of these pairs: (15,35), (0,111), (-12, 18), (99,100) and (252, 198).
1. Write a BigInteger version of the Euclid algorithm. Test this on 10 pairs of random ints of approx.. 512 bits.


## Week 2
1. Find the least non-negative residue mod 13 of these integers: 22, 100, 1001, -1, -100, -1000, 2^20 and 2^30.
1. Construct tables of addition and mult. Mod 8.
1. What times does a clock read:
   - 29 hours after it reads 11:00
   - 100 hours after it reads 2:00
   - 50 hours before it reads 6:00
1. Find the least positive residue of 3^10 mod 11, 2^12 mod 13, 5^16 mod 17, 3^22 mod 23. Do you detect a pattern?
   - Work through the Khan Academy section on Modular arithmetic.
1. Write out the complete multiplication tables for Z15*, Z24* and Z20*.
1. Draw the corresponding cycle graph for the elements in Z15*, Z21* and Z24* and Z17*.
1. Use gcd to find and print the group of units modulo n for n = 5 to 100. Print them out in this format:
   - Ex. n = 8: GroupOfUnitsMod 8 = {1,3,5,7}. Also include the number of elements. (This equals phi(n)).
1. When you look at the number of elements, do you notice any patterns? In particular, what happens when n is prime? 
   - What happens when n is the product of two primes?
1. For all primes p,q = 2,3,5,7,11,13,17,19,23 and 29 verify that phi(p) = p-1, (there are 10 cases)
   - phi(pq) = (p-1)*(q-1) (there are 45 cases), p and q different.
1. Find the order of all elements in the group of units mod 7, 11 and 15.
1. Use your answers in exercise above to find the inverses of each element.


## Week 3
1. Compute a table of the following values for the group of units mod 7, 11, and 15.
   - Element, inverse, order and test Fermat’s theorem (pass or not), for each element in the group.
1. For all integers n in the range [2, 1000] compute 2^(n-1) mod n. How many primes did it detect? How many composites did it detect?
1. For n from 5 to 1000: compute this ratio:
   - (# of a’s in {1,2,3 …, n-1} that pass Fermat’s Test)/(n-1). In every case, it should detect a prime. Does it?. When n is composite (product of 2 or more primes), verify that the ratio is <= ½ (except in one case: which case).
1. Use Euler’s theorem and pencil and paper to find the least positive residue of 3^1000000 mod 35.
1. Use Euler’s theorem and pencil and paper to find the last digit of 7^1000.
1. Using the (slow) algorithm you wrote in class to compute these numbers and time how long it takes:
   - 123456789^123456789
   - 123456789^1234567890
   - 123456789^12345678901
   - Mod 987654321.
1. Write a BigInteger version of fast ModularExponentiation. Test it with 5 different cases using random BigIntegers on 1024 bits for base, exponent and modulus. The speedup over the naïve algorithm should be roughly 10^300 to 1. Explain why.


## Week 4
1. Add the primetest code as a function to utilities.
1. Write a gp function called eulerphilist(n) that prints a list of the euler phi function fro I = 2 to n. Ad to utilities.
1. Write a gp function called inverse(a,n) that computes the inverse of a in the group of units mod n. It should be able to detect an a that is not in the group. Add to utilities.
1. Simulate the Rabin-Miller process as follows:
   - Generate a random BigInteger n with approx. 1024 bits for the modulus. This is the number we are testing for primality.
   - Generate a random BigInteger a with approx. 1024 bits for the base. Make sure it is less than n.
   - Verify a is coprime to n. If not, n is composite.
   - Now run the Fermat test on on a. If it fails, n is composite. Add 1 to n and go to step B.
   - Repeat this process (selecting new a’s every time) until n passes the test 100 times in succession. The n you now have is very probably prime.
1. Test the following constructors and methods of the BigInteger class:
   - Constructors: let p = a BigInteger of bitlength 512, which is probably prime. Also construct random integers a,b, and n of bitlength 512 each.
      - Use the above to illustrate these methods:
      - a+b
      - the bitlength of n
      - determine which of a and b is bigger
      - a/b
      - test if p is probably prime
      - a mod n
      - a^-1 mod n
      - a^b mod n
      - a*b mod n
      - the next prime after p
      - q = 'a probable prime of bit length 512' (not using a constructor


## Week 5
1. Write out the entire plain text message for the text given in class. Then encrypt it using the public key and the conversion to numbers scheme given in class (PULIC KEY CRYPTOGRAPHY)
1. Verify that 937 is the inverse of 13 mod phi(2537).
1. Decode the entire message using the exponent 937.
1. Pick your own exponent bigger than 40, and repeat the above.
1. Generage two primes around 512 bits each such that the product is exactly 300 decimal digits.


## Week 6 - 7
1. Prepare your presentation on RSA encryption


## Week 8
1. Use Trotter's algorithm to generate by hand all the permutations of {1,2,3,4}. Verify your results
1. Use Trotter's algorithm to generate by hand the first 30 permutations of {1,2,3,4,5}. Verify all are distinct.
1. Give a list of the number of permutations of n things for n=1 to n=100. Is it feasible to run through all the permuations of 100 things to solve a problem? Give reasons.


## Week 11
1. Use the quick sort algorithm to sort by hand the following integer sequence. Draw a picture of every step in the process.
   - 50 12 59 10 74 41 80 55 17 40 90 95 30 31 9 51
1. Show by hand how the Boyer-Moore algorithm would locate the pattern "Spring" in the end of term projects pdf on the G: drive. Repeat the pattern "the first person"
1. Find the Huffman encoding for compressing the data file with the symbol frequencies given in class.
1. Compute the compression ratio over using ascii encoding. (Hint: 146/464 = .314)


## Week 12
1. Suppose you counted the number of operations required for your algorithm and got 76n^3, where n is the size of the input. If the time it takes on your laptop is T, how long will it take if you double the size of the input? Based on this, what can you say about the complexity class of your algorithm? (The result will be the same no matter what machine you use.)
1. Repeat the above if the number of operations required for your algorithm is 2^n.
1. Find 4 different topological sorts of the graph given in class.
1. If we represent the above graph as a matrix:
   - How do we detect a vertex with no successor?
   - How do we delete this vertex and all edges adjacent to it?


## Week 13
1. Randomly number the edges of a cube graph using all the weights 1 through 12. Then show all the steps of the Prim algorithm to determine the minimal spanning tree. Show how sets S and T evolve during the solution.
1. Let T = {0.6, 0.1, 0.2, 0.9, 0.8, 0.5, 0.4, 0.7, 0.6, 0.1, 0.2, 0.9, 0.8, 0.5, 0.4, 0.7} and show the packings using simple first fit and first fit decreasing. Can you find a better packing in either case?
