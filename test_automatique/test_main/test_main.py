import shlex, subprocess, time, os

#Addition 
if os.path.exists("addition_out.py"):
    command_out = "python3 addition_out.py 3 2"
    print ("Addition : 2 + 3 = ",subprocess.Popen(shlex.split(command_out)))

time.sleep(2)

# Soustraction
if os.path.exists("soustraction_out.py"):
    command_out = "python3 soustraction_out.py 7 4"
    print ("Soustraction : 7 - 4 = ",subprocess.Popen(shlex.split(command_out)))


time.sleep(2)

# Multiplication
if os.path.exists("multiplication_out.py"):
    command_out = "python3 multiplication_out.py 3 4"
    print ("Multiplication : 3 * 4 = ",subprocess.Popen(shlex.split(command_out)))

time.sleep(2)

# Division 
if os.path.exists("division_out.py"):
    command_out = "python3 division_out.py 5 2"
    print ("Division : 5 % 2 = ",subprocess.Popen(shlex.split(command_out)))

time.sleep(2)

# Factorielle 
if os.path.exists("factorielle_out.py"):
    command_out = "python3 factorielle_out.py 4"
    print ("Factorielle(4) = ",subprocess.Popen(shlex.split(command_out)))

time.sleep(2)

# Sort 
if os.path.exists("sort_out.py"):
    command_out = "python3 sort_out.py 3 6 1 8 2"
    print (" Tri de 3 6 1 8 2 = ",subprocess.Popen(shlex.split(command_out)))

time.sleep(2)