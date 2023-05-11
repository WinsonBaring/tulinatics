package Graph;

import java.util.*;
import java.lang.reflect.*;

class Tester {
    private static List<Field> getAllFields(List<Field> fields, Class<?> type) {
        fields.addAll(Arrays.asList(type.getDeclaredFields()));
    
        if (type.getSuperclass() != null) {
            getAllFields(fields, type.getSuperclass());
        }
    
        return fields;
    }
    
    private static Field getField(Object obj, String fieldName) {
        List<Field> fields = getAllFields(new LinkedList<Field>(), obj.getClass());
        for(Field f : fields){
            if (f.getName().equals(fieldName)) {
                return f;
            }
        }
        return null;
    }

    private static Method getMethod(Object obj, String methodName) {
        Method[] methods = obj.getClass().getMethods();
        for (Method m : methods) {
            if (m.getName().equals(methodName)) {
                return m;
            }
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
    public static void test (Graph someGraph) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter code: ");
        double code = scanner.nextInt();
        if (code == 1) {
            if(Modifier.isAbstract(Graph.class.getModifiers())) {
                System.out.println("SUCCESS");
            }else {
                System.out.println("FAILED");
            }
        }

        else if (code == 2) {
            Field adjacencyList = getField(someGraph, "adjacencyList");

            if(adjacencyList != null) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILED");
            }
        }

        else if (code == 3) {
            try {
                Method addVertex = Graph.class.getDeclaredMethod("addVertex", int.class);
                Method addEdge = Graph.class.getDeclaredMethod("addEdge", int.class, int.class);
                Method getNeighbors = Graph.class.getDeclaredMethod("getNeighbors", int.class);

       
                if (addVertex != null) {
                    if(!(Modifier.isAbstract(addVertex.getModifiers()))) {
                        System.out.println("FAILED");
                        return;
                    }
                }else {
                     System.out.println("FAILED");
                }

                if (addEdge != null) {
                    if(!(Modifier.isAbstract(addEdge.getModifiers()))) {
                        System.out.println("FAILED");
                        return;
                    }
                }else {
                     System.out.println("FAILED");

                }

                if (getNeighbors != null) {
                    if(!(Modifier.isAbstract(getNeighbors.getModifiers()))) {
                        System.out.println("FAILED");
                        return;
                    }
                }else {
                     System.out.println("FAILED");
                }

                System.out.println("SUCCESS");
            } 
            catch(Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 4) {
            UndirectedGraph newUndirectedGraph = new UndirectedGraph();

            if (newUndirectedGraph instanceof Graph) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILED");
            }
        }

        else if (code == 5) {
            DirectedGraph newDirectedGraph = new DirectedGraph();

            if (newDirectedGraph instanceof Graph) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILED");
            }
        }

        else if (code == 6) {
            Method addVertex = Tester.getMethod(someGraph, "addVertex");
            Method addEdge = Tester.getMethod(someGraph, "addEdge");
            Method printGraph = Tester.getMethod(someGraph, "printGraph");

            try {
                addVertex.invoke(someGraph, 0);
                addVertex.invoke(someGraph, 1);
                addVertex.invoke(someGraph, 2);
                addVertex.invoke(someGraph, 3);
                addEdge.invoke(someGraph, 0, 1);
                addEdge.invoke(someGraph, 1, 2);
                addEdge.invoke(someGraph, 2, 3);
                addEdge.invoke(someGraph, 3, 0);
                addEdge.invoke(someGraph, 1, 3);
                printGraph.invoke(someGraph);
                System.out.println("SUCCESS");
            } catch(Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 7) {
            Method addVertex = Tester.getMethod(someGraph, "addVertex");
            Method addEdge = Tester.getMethod(someGraph, "addEdge");
            Method printGraph = Tester.getMethod(someGraph, "printGraph");

            try {
                addVertex.invoke(someGraph, 0);
                addVertex.invoke(someGraph, 1);
                addVertex.invoke(someGraph, 2);
                addVertex.invoke(someGraph, 3);
                addEdge.invoke(someGraph, 0, 1);
                addEdge.invoke(someGraph, 1, 2);
                addEdge.invoke(someGraph, 2, 3);
                printGraph.invoke(someGraph);
                System.out.println("SUCCESS");
            } catch(Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 8) {
            Method addVertex = Tester.getMethod(someGraph, "addVertex");
            Method addEdge = Tester.getMethod(someGraph, "addEdge");
            Method printGraph = Tester.getMethod(someGraph, "printGraph");

            try {
                addVertex.invoke(someGraph, 0);
                addVertex.invoke(someGraph, 1);
                addVertex.invoke(someGraph, 2);
                addVertex.invoke(someGraph, 3);
                addEdge.invoke(someGraph, 0, 1);
                addEdge.invoke(someGraph, 1, 2);
                addEdge.invoke(someGraph, 2, 3);
                addEdge.invoke(someGraph, 3, 0);
                addEdge.invoke(someGraph, 1, 3);
                addEdge.invoke(someGraph, 3, 1);
                printGraph.invoke(someGraph);
                System.out.println("SUCCESS");
            } catch(Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 9) {
            Method addVertex = Tester.getMethod(someGraph, "addVertex");
            Method addEdge = Tester.getMethod(someGraph, "addEdge");
            Method printGraph = Tester.getMethod(someGraph, "printGraph");

            try {
                addVertex.invoke(someGraph, 0);
                addVertex.invoke(someGraph, 1);
                addVertex.invoke(someGraph, 2);
                addVertex.invoke(someGraph, 3);
                printGraph.invoke(someGraph);
                System.out.println("SUCCESS");
            } catch(Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 10) {
            Method addVertex = Tester.getMethod(someGraph, "addVertex");
            Method addEdge = Tester.getMethod(someGraph, "addEdge");
            Method printGraph = Tester.getMethod(someGraph, "printGraph");

            try {
                addVertex.invoke(someGraph, 0);
                addVertex.invoke(someGraph, 1);
                addVertex.invoke(someGraph, 2);
                addVertex.invoke(someGraph, 3);
                addEdge.invoke(someGraph, 0, 1);
                addEdge.invoke(someGraph, 1, 2);
                addEdge.invoke(someGraph, 2, 3);
                addEdge.invoke(someGraph, 3, 0);
                addEdge.invoke(someGraph, 1, 3);
                addEdge.invoke(someGraph, 0, 2);
                addEdge.invoke(someGraph, 2, 1);
                printGraph.invoke(someGraph);
                System.out.println("SUCCESS");
            } catch(Exception e) {
                System.out.println("FAILED");
            }
        }
        else if (code == 11) {
            Method addVertex = Tester.getMethod(someGraph, "addVertex");
            Method addEdge = Tester.getMethod(someGraph, "addEdge");
            Method getNeighbors = Tester.getMethod(someGraph, "getNeighbors");

            try {
                addVertex.invoke(someGraph, 0);
                addVertex.invoke(someGraph, 1);
                addVertex.invoke(someGraph, 2);
                addVertex.invoke(someGraph, 3);
                addEdge.invoke(someGraph, 0, 1);
                addEdge.invoke(someGraph, 1, 2);
                addEdge.invoke(someGraph, 2, 3);
                addEdge.invoke(someGraph, 3, 0);
                addEdge.invoke(someGraph, 1, 3);
                
                ArrayList<Integer> neighbors = (ArrayList<Integer>) getNeighbors.invoke(someGraph, 1);

                ArrayList<Integer> expectedNeighbors = null;

                if (someGraph instanceof UndirectedGraph) {
                    expectedNeighbors = new ArrayList<>(Arrays.asList(0, 2, 3));
                } else if (someGraph instanceof DirectedGraph) {
                    expectedNeighbors = new ArrayList<>(Arrays.asList(2, 3));
                }

                if (neighbors.equals(expectedNeighbors)) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("FAILED");
                }
            } catch(Exception e) {
                System.out.println("FAILED");
            }
        }

    }
}