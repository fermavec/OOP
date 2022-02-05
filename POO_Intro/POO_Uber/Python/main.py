from car import Car
from account import Account

if __name__ == '__main__':
    car = Car('AMD123', Account('Arumi Karasugi', 'AKAS851012'))
    car.passengers = 5
    print(vars(car))

    car2 = Car('321DMA', Account('Igusarak Imura', 'IARU870715'))
    car2.passengers = 3
    print(vars(car2))