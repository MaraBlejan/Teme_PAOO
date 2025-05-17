import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

// Interfață pentru rezolvarea ecuațiilor de gradul I
interface EcuationSolver {
    JSONObject solve(double a, double b);
}

// Implementare pentru ecuații liniare cu o singură soluție (ax + b = 0, a != 0)
class LinearEcuationSolver implements EcuationSolver {
    @Override
    public JSONObject solve(double a, double b) {
        JSONObject result = new JSONObject();
        if (a == 0) {
            result.put("status", "eroare");
            result.put("mesaj", "Coeficientul 'a' nu poate fi zero pentru o ecuație liniară cu o singură soluție.");
        } else {
            double x = -b / a;
            result.put("status", "succes");
            result.put("solutie", x);
        }
        return result;
    }
}

// Implementare pentru ecuații care sunt identități (0x + 0 = 0, infinit de multe soluții)
class IdentityEcuationSolver implements EcuationSolver {
    @Override
    public JSONObject solve(double a, double b) {
        JSONObject result = new JSONObject();
        if (a == 0 && b == 0) {
            result.put("status", "succes");
            result.put("solutie", "infinit de multe");
        } else {
            result.put("status", "eroare");
            result.put("mesaj", "Această ecuație nu este o identitate.");
        }
        return result;
    }
}

// Implementare pentru ecuații inconsistente (0x + b = 0, b != 0, nu are soluții)
class InconsistentEcuationSolver implements EcuationSolver {
    @Override
    public JSONObject solve(double a, double b) {
        JSONObject result = new JSONObject();
        if (a == 0 && b != 0) {
            result.put("status", "succes");
            result.put("solutie", "nu există");
        } else {
            result.put("status", "eroare");
            result.put("mesaj", "Această ecuație nu este inconsistentă.");
        }
        return result;
    }
}

// Clasa context care decide ce strategie de rezolvare să folosească
class EcuationContext {
    private EcuationSolver solver;

    public void setSolver(EcuationSolver solver) {
        this.solver = solver;
    }

    public JSONObject solveEcuation(double a, double b) {
        if (this.solver != null) {
            return this.solver.solve(a, b);
        } else {
            JSONObject error = new JSONObject();
            error.put("status", "eroare");
            error.put("mesaj", "Nicio strategie de rezolvare nu a fost setată.");
            return error;
        }
    }
}

// Clasa responsabilă cu salvarea datelor în format JSON
class JsonOutput {
    public void save(JSONObject data, String filename) {
        try (FileWriter file = new FileWriter(filename)) {
            file.write(data.toString(4)); // Indentare pentru lizibilitate
            System.out.println("Datele au fost salvate în " + filename);
        } catch (IOException e) {
            System.err.println("Eroare la scrierea în fișier: " + e.getMessage());
        }
    }
}

