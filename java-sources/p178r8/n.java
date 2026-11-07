package p178r8;

import E8.d;
import org.json.JSONException;
import org.json.JSONObject;
import p248z6.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21635a;

    static {
        d dVar = new d();
        a aVar = a.f21597a;
        dVar.a(n.class, aVar);
        dVar.a(b.class, aVar);
        f21635a = new c(5, dVar);
    }

    public static b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new b(string, string2, string3, string4, j);
    }
}
