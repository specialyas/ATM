
# ATM Application

This is a simple ATM application written in Java, which simulates basic banking operations like checking account balance, depositing money, withdrawing money, and viewing the transaction history.

## Features

- **Check Balance**: View your current account balance.
- **Deposit Money**: Add funds to your account.
- **Withdraw Money**: Withdraw funds from your account, with validation for sufficient balance.
- **Mini Statement**: View the last 5 transactions performed.

## Requirements

- Java Development Kit (JDK) 8 or above
- An IDE or command-line interface for compiling and running Java programs

## Installation & Running the Application

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/atm-application.git
   ```
   
2. **Navigate to the project directory**:
   ```bash
   cd atm-application
   ```

3. **Compile the Java files**:
   ```bash
   javac com/yas/AtmFunctionalities.java com/yas/Atm.java
   ```

4. **Run the application**:
   ```bash
   java com.yas.Atm
   ```

## Usage

- **Enter PIN**: You will be prompted to enter your PIN. The correct default PIN is `1234`.
- **Choose an option from the menu**:
    - Press `1` to check your balance.
    - Press `2` to deposit money.
    - Press `3` to withdraw money.
    - Press `4` to view your mini statement (last 5 transactions).
    - Press `5` to exit the application.

## Sample Output

```
Enter your Pin: 1234

Welcome...!
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. View Mini Statement
5. Exit

Please choose an option (1-4): 1
Your current balance is: ₦0.0
```

## Code Structure

- **AtmFunctionalities.java**: Contains all the core functionalities like checking balance, depositing, withdrawing, and viewing transaction history.
- **Atm.java**: The main entry point of the application that calls the methods from `AtmFunctionalities`.

### Key Classes and Methods:

- `AtmFunctionalities`:
    - `start()`: Handles the PIN input and validation.
    - `menu()`: Displays the main options.
    - `checkAccountBalance()`: Shows the current account balance.
    - `depositMoney()`: Allows the user to deposit an amount.
    - `withdrawMoney()`: Allows the user to withdraw an amount.
    - `miniStatement()`: Displays the last 5 transactions.

- `Atm`: Starts the application by calling the `start()` method from `AtmFunctionalities`.

## Future Enhancements

- Add user authentication with multiple users.
- Implement database integration to store account details persistently.
- Add the ability to change PIN.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact Information

For any inquiries, feel free to reach out:

- **Name**: Yusuf Sani
- **Email**: yusufabdulazizsani@gmail.com
