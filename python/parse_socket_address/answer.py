import re
"""
This is the file with your answer, do not rename or move it.
Write your code in it, and save it before submitting your answer.
"""

def is_valid_socket_address(socket_address):
	"""Determine if the provided string is a valid socket address.
	This function declaration must be kept unmodified.

	Args:
		socket_address: A string with a socket address, eg, 
			'127.12.23.43:5000', to be checked for validity.
	Returns:
		A boolean indicating whether the provided string is a valid 
		socket address.
	"""

	ip3Oct = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}" #reg ex for first 3 octetes
	ip4Oct = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)" #reg ex for 4 octete
	port = ":(6(?:[0-4][0-9]{3}|5(?:[0-4][0-9]{2}|5(?:[0-2][0-9]|3[0-5])))|[1-5][0-9]{4}|[1-9][0-9]{1,3}|[0-9])$" #reg exp for port number
	pat = re.compile(ip3Oct + ip4Oct + port)
	test = pat.match(socket_address)
	if test:
		return True
	else:
		return False

# This tests your code with the examples given in the question, 
# and is provided only for your convenience.
if __name__ == '__main__':
	for socket_address in ["127.12.23.43:5000",
				   "127.A:-12"]:
		print is_valid_socket_address(socket_address)


