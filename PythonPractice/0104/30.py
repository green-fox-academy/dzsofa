ac = 8
time = 120
out = ''
# if ac is dividable by 4
# and time is not more than 200
# set out to 'check'
# if time is more than 200
# set out to 'Time out'
# otherwise set out to 'Run Forest Run!'


def conditions(number, time):
    out = ''
    if number % 4 == 0 and time <= 200:
        out = 'check'
    elif time > 200:
        out = 'time out'
    else:
        out = 'run Forrest, run!'
    return out


print(conditions(ac, time))
