import shlex, subprocess, time, os, time

# #addition
# command_line = "java -jar \"whc_python.jar\" addition.wh addition_out.py"
# args=shlex.split(command_line)
# print(args)
# a=subprocess.Popen(args)

# #Soustraction
# command_line = "java -jar \"whc_python.jar\" soustraction.wh soustraction_out.py"
# args=shlex.split(command_line)
# print(args)
# a=subprocess.Popen(args)


# #Multiplication
# command_line = "java -jar \"whc_python.jar\" multiplication.wh multiplication_out.py"
# args=shlex.split(command_line)
# print(args)
# a=subprocess.Popen(args)

# #Division
# command_line = "java -jar \"whc_python.jar\" division.wh division_out.py"
# args=shlex.split(command_line)
# print(args)
# a=subprocess.Popen(args)

# #Sort
# command_line = "java -jar \"whc_python.jar\" sort.wh sort_out.py"
# args=shlex.split(command_line)
# print(args)
# a=subprocess.Popen(args)

# #Factorielle
# command_line = "java -jar \"whc_python.jar\" factorielle.wh factorielle_out.py"
# args=shlex.split(command_line)
# print(args)
# a=subprocess.Popen(args)

#Tes profondeur
command_line = "java -jar \"whc_python.jar\" stress_test_pr.wh profondeur_out.py"
args=shlex.split(command_line)
print(args)
a=subprocess.Popen(args)

