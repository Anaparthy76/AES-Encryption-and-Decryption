# AES-Encryption-and-Decryption
Demonstrates how to encrypt and decrypt a message using the AES (Advanced Encryption Standard) algorithm. It involves three classes: AESEncryption, AESDecryption, and Main. The project performs the following steps:

Generate a random secret key using AES for encryption.

Initialize the Cipher in encryption mode using the secret key.

Encrypt a given message using the doFinal() method and encode the result in Base64 for display and transmission.

Initialize the Cipher in decryption mode using the same secret key used for encryption.

Decode the Base64-encoded encrypted message and decrypt it back to the original message.


