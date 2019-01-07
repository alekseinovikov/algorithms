import random


def randomize(element_list):
    """Randomize order of the list"""

    element_list = list(element_list)

    length = len(element_list)
    for i in range(length):
        swap_index = __get_swap_index(i, length - 1)
        __swap(element_list, i, swap_index)

    return element_list


def __get_swap_index(from_index, to_index):
    return random.randint(from_index, to_index)


def __swap(elements, from_index, to_index):
    temp = elements[from_index]
    elements[from_index] = elements[to_index]
    elements[to_index] = temp
