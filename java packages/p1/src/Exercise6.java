class Invalid_Input_Exception extends Exception {
    @Override
    public String toString() {
        return "Invalid_Input_Exception ";
    }
}


class Cannot_Divide_by_zero_Exception extends Exception {
    @Override
    public String toString() {
        return "Cannot_Divide_by_zero_Exception";
    }
}


class Max_Input_Exception extends Exception {
    @Override
    public String toString() {
        return "Max_Input_Exception";
    }
}


class Input_Is_Greater_Than_7000 extends Exception {
    @Override
    public String toString() {
        return "Input_Is_Greater_Than_7000";
    }
}

class Custom_Calculator1 {

    public void addition(int a, int b) throws Invalid_Input_Exception, Max_Input_Exception {
        if (a == 8 && b == 9) {
            throw new Invalid_Input_Exception();
        } else if (a > 100000 || b > 100000) {
            throw new Max_Input_Exception();
        } else {
            System.out.println(a + b);
        }
    }

    public void subtraction(int a, int b) throws Invalid_Input_Exception, Max_Input_Exception {
        if (a == 8 && b == 9) {
            throw new Invalid_Input_Exception();
        } else if (a > 100000 || b > 100000) {
            throw new Max_Input_Exception();
        } else {
            System.out.println(a - b);
        }
    }

    public void multiplication(int a, int b) throws Invalid_Input_Exception, Max_Input_Exception, Input_Is_Greater_Than_7000 {
        if (a == 8 && b == 9) {
            throw new Invalid_Input_Exception();
        } else if (a > 100000 || b > 100000) {
            throw new Max_Input_Exception();
        } else if (a > 7000 || b > 7000) {
            throw new Input_Is_Greater_Than_7000();
        } else {
            System.out.println(a * b);
        }
    }

    public void division(int a, int b) throws Invalid_Input_Exception, Max_Input_Exception, Cannot_Divide_by_zero_Exception {
        if (a == 8 && b == 9) {
            throw new Invalid_Input_Exception();
        } else if (a > 100000 || b > 100000) {
            throw new Max_Input_Exception();
        } else if (b == 0) {
            throw new Cannot_Divide_by_zero_Exception();
        } else {
            System.out.println(a / b);
        }
    }
}

    public class Exercise6 {
        public static void main(String[] args) {

            Custom_Calculator1 calc = new Custom_Calculator1();

            try {
                calc.addition(4,89);
            } catch (Invalid_Input_Exception e) {
                System.out.println(e);
            } catch (Max_Input_Exception e) {
                System.out.println(e);
            }
            try {
                calc.subtraction(10000000,5000);
            } catch (Invalid_Input_Exception e) {
                System.out.println(e);
            } catch (Max_Input_Exception e) {
                System.out.println(e);
            }
            try {
                calc.multiplication(8000,5);
            } catch (Invalid_Input_Exception e) {
                System.out.println(e);
            } catch (Max_Input_Exception e) {
                System.out.println(e);
            } catch (Input_Is_Greater_Than_7000 e) {
                System.out.println(e);
            }
            try {
                calc.division(2,0);
            } catch (Invalid_Input_Exception e) {
                System.out.println(e);
            } catch (Max_Input_Exception e) {
                System.out.println(e);
            } catch (Cannot_Divide_by_zero_Exception e) {
                System.out.println(e);
            }

        }
    }

