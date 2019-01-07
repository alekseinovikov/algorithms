import uuid
from unittest import TestCase

from src.main.python.array_randomizer.array_randomizer import randomize


class TestRandomize(TestCase):

    def test_randomize_strings_containsAllElements(self):
        # arrange
        string_list = ["first", "second", "third", "fourth"]

        # act
        result = randomize(string_list)

        # assert
        for element in string_list:
            self.assertTrue(element in result)

    def test_randomize_randomUuids_containsAllElements(self):
        # arrange
        uuid_list = [uuid.uuid4() for element in range(1000)]

        # act
        result = randomize(uuid_list)

        # assert
        for element in uuid_list:
            self.assertTrue(element in result)

    def test_randomize_empty_empty(self):
        # arrange
        list = []

        # act
        result = randomize(list)

        # assert
        self.assertListEqual(list, result)

    def test_randomize_numberList_changedOrder(self):
        # arrange
        number_list = list([element for element in range(1000)])

        # act
        result = randomize(number_list)

        # assert
        something_changed = False
        for (index, element) in enumerate(result):
            if number_list[index] != element:
                something_changed = True

        self.assertTrue(something_changed)

    def test_randomize_stringList_changedOrder(self):
        # arrange
        string_list = list([uuid.uuid4() for i in range(1000)])

        # act
        result = randomize(string_list)

        # assert
        something_changed = False
        for (index, element) in enumerate(result):
            if string_list[index] != element:
                something_changed = True

        self.assertTrue(something_changed)
