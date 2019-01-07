from unittest import TestCase

from src.main.python.euklid_gcd.euklid_gcd import gcd


class TestGcd(TestCase):

    def test_gcd_has_2(self):
        # act
        result = gcd(6, 4)
        # assert
        self.assertEqual(2, result)

    def test_gcd_has_5(self):
        # act
        result = gcd(5, 15)
        # assert
        self.assertEqual(5, result)

    def test_gcd_zero_zero(self):
        # act
        result = gcd(0, 0)
        # assert
        self.assertEqual(0, result)

    def test_gcd_simple_numbers_1(self):
        # act
        result = gcd(19, 23)
        # assert
        self.assertEqual(1, result)
