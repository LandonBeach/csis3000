# Returns True if num is a prime number
def rabinMiller(num):
    s = num -1
    t = 0
    while s % 2 == 0:
        # keep cutting s in half while it is even (and use t to count how many
        # time we cut s in half)
        s //= 2
        t += 1

    # try to falsify num's primality 100 times
    for trials in range(100):
        a = rand(2, num - 1)
        v = pow(a, s, num)

        # this test does not apply if v == 1
        if v != 1:
            i =0
            while v != (num -1):
                if i == t -1:
                    return False
                else:
                    i += 1
                    v = ( v ** 2) % num

    return True
