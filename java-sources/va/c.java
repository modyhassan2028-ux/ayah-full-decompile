package va;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import ka.r;
import p120l9.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f23397a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f23398b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r10 = r.class.getPackage();
        String name = r10 != null ? r10.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(r.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(ra.h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(na.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f23398b = w.k0(linkedHashMap);
    }

    public static void a(int i10, String str, Throwable th, String str2) {
        int iMin;
        String strS1 = (String) f23398b.get(str);
        if (strS1 == null) {
            strS1 = H9.o.s1(23, str);
        }
        if (Log.isLoggable(strS1, i10)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i11 = 0;
            while (i11 < length) {
                int iB1 = H9.o.b1(str2, '\n', i11, 4);
                if (iB1 == -1) {
                    iB1 = length;
                }
                while (true) {
                    iMin = Math.min(iB1, i11 + 4000);
                    String strSubstring = str2.substring(i11, iMin);
                    p251z9.j.d(strSubstring, "substring(...)");
                    Log.println(i10, strS1, strSubstring);
                    if (iMin >= iB1) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }
}
