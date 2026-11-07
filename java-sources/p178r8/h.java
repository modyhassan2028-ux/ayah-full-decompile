package p178r8;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p123m2.c;
import p160p8.g;
import p213v8.b;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f21617b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21618a;

    public h(b bVar) {
        this.f21618a = bVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(n.a(string));
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(n.f21635a.D(list.get(i10))));
            } catch (JSONException e10) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e10);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath() + "\nReason: " + str, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    public final Map c(String str, boolean z10) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e10;
        b bVar = this.f21618a;
        File fileB = z10 ? bVar.b(str, "internal-keys") : bVar.b(str, "keys");
        if (!fileB.exists() || fileB.length() == 0) {
            g(fileB, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileB);
                try {
                    HashMap mapA = a(g.i(fileInputStream));
                    g.b(fileInputStream, "Failed to close user metadata file.");
                    return mapA;
                } catch (Exception e11) {
                    e10 = e11;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e10);
                    f(fileB);
                    g.b(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th2) {
                th = th2;
                g.b(, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e12) {
            fileInputStream = null;
            e10 = e12;
        } catch (Throwable th3) {
            ?? r10 = 0;
            th = th3;
            g.b(r10, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File fileB = this.f21618a.b(str, "user-data");
        ?? r10 = 0;
        if (fileB.exists()) {
            ?? r11 = (fileB.length() > 0L ? 1 : (fileB.length() == 0L ? 0 : -1));
            try {
                if (r11 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileB);
                        try {
                            JSONObject jSONObject = new JSONObject(g.i(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            g.b(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e10) {
                            e = e10;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(fileB);
                            g.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        g.b(r10, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = r11;
            }
        }
        String strS = c.s("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strS, null);
        }
        f(fileB);
        return null;
    }

    public final void h(String str, Map map, boolean z10) {
        b bVar = this.f21618a;
        File fileB = z10 ? bVar.b(str, "internal-keys") : bVar.b(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f21617b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    g.b(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    f(fileB);
                    g.b(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    g.b(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
