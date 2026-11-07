package H8;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3591b;

    public /* synthetic */ c(d dVar, int i10) {
        this.f3590a = i10;
        this.f3591b = dVar;
    }

    private final Object a() {
        String string;
        d dVar = this.f3591b;
        synchronized (dVar) {
            try {
                j jVar = (j) dVar.f3592a.get();
                ArrayList arrayListC = jVar.c();
                jVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < arrayListC.size(); i10++) {
                    a aVar = (a) arrayListC.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.f3585a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.f3586b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3590a) {
            case 0:
                return a();
            default:
                d dVar = this.f3591b;
                synchronized (dVar) {
                    j jVar = (j) dVar.f3592a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    O8.b bVar = (O8.b) dVar.f3594c.get();
                    String str = bVar.f6508a;
                    O8.c cVar = bVar.f6509b;
                    if (!cVar.u().isEmpty()) {
                        str = str + ' ' + O8.b.a(cVar.u());
                    }
                    jVar.g(jCurrentTimeMillis, str);
                    break;
                }
                return null;
        }
    }
}
