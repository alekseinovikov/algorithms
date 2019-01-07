def gcd(a, b):
    while b != 0:
        reminder = a % b
        a = b
        b = reminder
    return a
