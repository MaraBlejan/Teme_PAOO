import org.json.JSONObject;
public class LinearEcuationSolverApp {
    public static void main(String[] args) {
        JsonOutput outputHandler = new JsonOutput();
        EcuationContext ecuationContext = new EcuationContext();

        // Ecuație cu o singură soluție (2x - 4 = 0)
        ecuationContext.setSolver(new LinearEcuationSolver());
        JSONObject rezultat1 = ecuationContext.solveEcuation(2, -4);
        outputHandler.save(rezultat1, "solutie_unica.json");

        // Ecuație identitate (0x + 0 = 0)
        ecuationContext.setSolver(new IdentityEcuationSolver());
        JSONObject rezultat2 = ecuationContext.solveEcuation(0, 0);
        outputHandler.save(rezultat2, "infinit_solutii.json");

        // Ecuație inconsistentă (0x + 5 = 0)
        ecuationContext.setSolver(new InconsistentEcuationSolver());
        JSONObject rezultat3 = ecuationContext.solveEcuation(0, 5);
        outputHandler.save(rezultat3, "fara_solutii.json");

        // Caz de eroare (a = 0 pentru LinearEcuationSolver)
        ecuationContext.setSolver(new LinearEcuationSolver());
        JSONObject rezultat4 = ecuationContext.solveEcuation(0, 3);
        outputHandler.save(rezultat4, "eroare_a_zero.json");
    }
}