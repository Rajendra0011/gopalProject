package Logical_program1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmstrongNumber {

    public static class TokenManager {

        public static int numberOfTokens(int expiryLimit, List<List<Integer>> commands) {
            Map<Integer, Integer> tokens = new HashMap<>();
            int maxTime = 0;

            for (List<Integer> command : commands) {
                int cmdType = command.get(0);
                int tokenId = command.get(1);
                int time = command.get(2);

                if (time > maxTime) {
                    maxTime = time;
                }

                if (cmdType == 0) {
                    // Create token with expiry time = time + expiryLimit
                    tokens.put(tokenId, time + expiryLimit);
                } else if (cmdType == 1) {
                    // Reset token expiry only if token exists and not expired
                    if (tokens.containsKey(tokenId) && tokens.get(tokenId) >= time) {
                        tokens.put(tokenId, time + expiryLimit);
                    }
                }
            }

            // Count tokens active after maxTime
            int activeCount = 0;
            for (int expiry : tokens.values()) {
                if (expiry > maxTime) {
                    activeCount++;
                }
            }

            return activeCount;
        }

        public static void main(String[] args) {
            int expiryLimit = 4;

            // Create the command list
            List<List<Integer>> commands = new ArrayList<>();
            commands.add(Arrays.asList(0, 1, 1));
            commands.add(Arrays.asList(0, 2, 2));
            commands.add(Arrays.asList(1, 1, 5));
            commands.add(Arrays.asList(1, 2, 7));

            System.out.println(numberOfTokens(expiryLimit, commands)); // Output: 1
        }
    }
}
