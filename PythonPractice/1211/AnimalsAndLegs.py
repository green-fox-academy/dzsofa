# Write a program that asks for two integers
# The first represents the number of chickens the farmer has
# The second represents the number of pigs owned by the farmer
# It should print how many legs all the animals have

chicken = int(input("Number of chicks: "))
pigs = int(input("Number of pigs: "))


def countlegs(chicken, pigs):
    allegs = (chicken * 2) + (pigs * 4)
    print("Number of your animals' legs is: " + str(allegs))


countlegs(chicken, pigs)


