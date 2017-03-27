package net.ipsoft.rhino;

import com.sun.phobos.script.javascript.RhinoScriptEngineFactory;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * @author opoleshuk
 */
public class RhinoTest {
    public static void main(String[] args) throws Exception {
        ScriptEngineManager m = new ScriptEngineManager();
        m.registerEngineName("rhino", new RhinoScriptEngineFactory());
        // specifically look for "rhino" engine
        ScriptEngine engine = m.getEngineByName("rhino");
        System.out.println(engine.eval("33 + 232"));
    }
}
