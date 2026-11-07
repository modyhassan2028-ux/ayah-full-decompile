package J6;

import B6.f;
import E6.i;
import E6.j;
import F6.g;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import p178r8.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4348t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4349u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4350v;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f4346r = i10;
        this.f4347s = obj;
        this.f4348t = obj2;
        this.f4349u = obj3;
        this.f4350v = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BufferedWriter bufferedWriter;
        switch (this.f4346r) {
            case 0:
                c cVar = (c) this.f4347s;
                j jVar = (j) this.f4348t;
                String str = jVar.f1937a;
                f fVar = (f) this.f4349u;
                i iVar = (i) this.f4350v;
                cVar.getClass();
                Logger logger = c.f4355f;
                try {
                    g gVarA = cVar.f4358c.a(str);
                    if (gVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        fVar.b(new IllegalArgumentException(str2));
                    } else {
                        ((L6.i) cVar.f4360e).w(new b(cVar, jVar, ((C6.d) gVarA).a(iVar), 0));
                        fVar.b(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    fVar.b(e10);
                    return;
                }
            default:
                p213v8.b bVar = (p213v8.b) this.f4347s;
                String str3 = (String) this.f4348t;
                Map map = (Map) this.f4349u;
                List list = (List) this.f4350v;
                h hVar = (h) bVar.f23379b;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar.g;
                BufferedWriter bufferedWriter2 = null;
                ?? r10 = 0;
                bufferedWriter2 = null;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    String str4 = (String) atomicMarkableReference.getReference();
                    ?? r11 = "user-data";
                    File fileB = hVar.f21618a.b(str3, "user-data");
                    try {
                        try {
                            p178r8.g gVar = new p178r8.g();
                            gVar.put("userId", str4);
                            String string = gVar.toString();
                            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), h.f21617b));
                            try {
                                bufferedWriter.write(string);
                                bufferedWriter.flush();
                                r11 = bufferedWriter;
                            } catch (Exception e11) {
                                e = e11;
                                Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                                r11 = bufferedWriter;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r10 = r11;
                            p160p8.g.b(r10, "Failed to close user metadata file.");
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        bufferedWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        p160p8.g.b(r10, "Failed to close user metadata file.");
                        throw th;
                    }
                    p160p8.g.b(r11, "Failed to close user metadata file.");
                }
                if (!map.isEmpty()) {
                    hVar.h(str3, map, false);
                }
                if (list.isEmpty()) {
                    return;
                }
                File fileB2 = hVar.f21618a.b(str3, "rollouts-state");
                if (list.isEmpty()) {
                    h.g(fileB2, "Rollout state is empty for session: " + str3);
                    return;
                }
                try {
                    try {
                        String strE = h.e(list);
                        BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB2), h.f21617b));
                        try {
                            bufferedWriter3.write(strE);
                            bufferedWriter3.flush();
                            p160p8.g.b(bufferedWriter3, "Failed to close rollouts state file.");
                            return;
                        } catch (Exception e13) {
                            e = e13;
                            bufferedWriter2 = bufferedWriter3;
                            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                            h.f(fileB2);
                            p160p8.g.b(bufferedWriter2, "Failed to close rollouts state file.");
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedWriter2 = bufferedWriter3;
                            p160p8.g.b(bufferedWriter2, "Failed to close rollouts state file.");
                            throw th;
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
        }
    }
}
