package p147o6;

import A3.g;
import A3.h;
import Da.A;
import Da.d;
import K9.InterfaceC0402u;
import K9.a0;
import K9.r;
import android.content.Context;
import android.net.Uri;
import com.ayah.common.data.source.database.AyahDatabase;
import com.ayah.dao.backup.BackupData;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.o;
import com.squareup.moshi.z;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p035d3.u;
import p110k9.y;
import p150o9.c;
import p150o9.f;
import p166q4.a;
import p232y.T;
import p232y.U;
import p232y.V;
import p241y9.e;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f20334A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Object f20335B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20336r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f20338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f20339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f20340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f20341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f20342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f20343y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f20344z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, Uri uri, a aVar, c cVar) {
        super(2, cVar);
        this.f20344z = context;
        this.f20334A = uri;
        this.f20335B = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [q9.i, y9.e] */
    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f20336r) {
            case 0:
                return new b((Context) this.f20344z, (Uri) this.f20334A, (a) this.f20335B, cVar);
            default:
                b bVar = new b((T) this.f20343y, (V) this.f20344z, (i) this.f20334A, this.f20335B, cVar);
                bVar.f20342x = obj;
                return bVar;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f20336r) {
            case 0:
                break;
        }
        return ((b) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0176 A[Catch: all -> 0x01a3, Exception -> 0x01a5, TryCatch #12 {Exception -> 0x01a5, all -> 0x01a3, blocks: (B:62:0x0170, B:64:0x0176, B:67:0x0198, B:76:0x01a7, B:78:0x01bb), top: B:114:0x0170 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:67:0x0198 A[Catch: all -> 0x01a3, Exception -> 0x01a5, TryCatch #12 {Exception -> 0x01a5, all -> 0x01a3, blocks: (B:62:0x0170, B:64:0x0176, B:67:0x0198, B:76:0x01a7, B:78:0x01bb), top: B:114:0x0170 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01bb A[Catch: all -> 0x01a3, Exception -> 0x01a5, TRY_LEAVE, TryCatch #12 {Exception -> 0x01a5, all -> 0x01a3, blocks: (B:62:0x0170, B:64:0x0176, B:67:0x0198, B:76:0x01a7, B:78:0x01bb), top: B:114:0x0170 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [y9.e] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r1v0, types: [S9.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        AyahDatabase ayahDatabase;
        InputStream inputStream;
        p145o4.a aVar;
        h hVar;
        BackupData backupData;
        Iterator it;
        Throwable th;
        g gVarL;
        ArrayList arrayListA;
        int size;
        int i10;
        Object objR;
        S9.a aVar2;
        U u8;
        ?? r10;
        ?? r11;
        Throwable th2;
        V v10;
        S9.a aVar3;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i11 = this.f20336r;
        ?? r12 = this.f20335B;
        Object obj2 = this.f20334A;
        p161p9.a aVar4 = p161p9.a.f21156r;
        InputStream inputStreamOpenInputStream = null;
        Object obj3 = this.f20344z;
        boolean z10 = true;
        switch (i11) {
            case 0:
                Context context = (Context) obj3;
                int i12 = this.f20337s;
                boolean z11 = false;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f20343y;
                    hVar = (h) this.f20342x;
                    backupData = (BackupData) this.f20341w;
                    aVar = (p145o4.a) this.f20340v;
                    InputStream inputStream2 = (InputStream) this.f20339u;
                    ayahDatabase = (AyahDatabase) this.f20338t;
                    try {
                        p110k9.a.e(obj);
                        inputStream = inputStream2;
                        do {
                            try {
                                if (it.hasNext()) {
                                    E3.c cVar = (E3.c) it.next();
                                    this.f20338t = ayahDatabase;
                                    this.f20339u = inputStream;
                                    this.f20340v = aVar;
                                    this.f20341w = backupData;
                                    this.f20342x = hVar;
                                    this.f20343y = it;
                                    this.f20337s = 1;
                                    objR = B9.a.R(hVar.f497a, false, true, new A3.e(2, hVar, cVar), this);
                                    if (objR == aVar4) {
                                        objR = y.f19095a;
                                    }
                                } else {
                                    gVarL = ayahDatabase.l();
                                    List list = backupData.f13730a;
                                    aVar.getClass();
                                    arrayListA = p145o4.a.a(list);
                                    size = arrayListA.size();
                                    i10 = 0;
                                    while (i10 < size) {
                                        Object obj4 = arrayListA.get(i10);
                                        i10++;
                                        gVarL.getClass();
                                        B9.a.Q(gVarL.f495a, false, true, new A3.e(0, gVarL, new E3.b[]{(E3.b) obj4}));
                                    }
                                    inputStreamOpenInputStream = inputStream;
                                    if (inputStreamOpenInputStream != null) {
                                        try {
                                            inputStreamOpenInputStream.close();
                                            break;
                                        } catch (Exception unused) {
                                        }
                                    }
                                    z11 = z10;
                                }
                            } catch (Exception e10) {
                                inputStreamOpenInputStream = inputStream;
                                e = e10;
                                ((a) r12).b(e);
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        inputStreamOpenInputStream.close();
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                }
                            } catch (Throwable th3) {
                                inputStreamOpenInputStream = inputStream;
                                th = th3;
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        inputStreamOpenInputStream.close();
                                        break;
                                    } catch (Exception unused3) {
                                    }
                                }
                                throw th;
                            }
                        } while (objR != aVar4);
                        return aVar4;
                    } catch (Exception e11) {
                        e = e11;
                        inputStreamOpenInputStream = inputStream2;
                        ((a) r12).b(e);
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                            break;
                        }
                        return Boolean.valueOf(z11);
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamOpenInputStream = inputStream2;
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                            break;
                        }
                        throw th;
                    }
                }
                p110k9.a.e(obj);
                Context applicationContext = context.getApplicationContext();
                j.d(applicationContext, "getApplicationContext(...)");
                AyahDatabase ayahDatabase2 = (AyahDatabase) ((u) ((C3.b) p000a.a.G(applicationContext, C3.b.class))).f15679w.get();
                try {
                    try {
                        inputStreamOpenInputStream = context.getContentResolver().openInputStream((Uri) obj2);
                        JsonAdapter jsonAdapterA = new C(new z(0)).a(BackupData.class);
                        p145o4.a aVar5 = p145o4.a.f20330a;
                        j.b(inputStreamOpenInputStream);
                        BackupData backupData2 = (BackupData) jsonAdapterA.a(new o(Y2.a.p(new d(1, inputStreamOpenInputStream, new A()))));
                        if (backupData2 != null) {
                            h hVarM = ayahDatabase2.m();
                            ayahDatabase = ayahDatabase2;
                            inputStream = inputStreamOpenInputStream;
                            aVar = aVar5;
                            hVar = hVarM;
                            backupData = backupData2;
                            it = p145o4.a.b(backupData2.f13731b).iterator();
                            do {
                                if (it.hasNext()) {
                                    E3.c cVar2 = (E3.c) it.next();
                                    this.f20338t = ayahDatabase;
                                    this.f20339u = inputStream;
                                    this.f20340v = aVar;
                                    this.f20341w = backupData;
                                    this.f20342x = hVar;
                                    this.f20343y = it;
                                    this.f20337s = 1;
                                    objR = B9.a.R(hVar.f497a, false, true, new A3.e(2, hVar, cVar2), this);
                                    if (objR == aVar4) {
                                        objR = y.f19095a;
                                    }
                                } else {
                                    gVarL = ayahDatabase.l();
                                    List list2 = backupData.f13730a;
                                    aVar.getClass();
                                    arrayListA = p145o4.a.a(list2);
                                    size = arrayListA.size();
                                    i10 = 0;
                                    while (i10 < size) {
                                        Object obj5 = arrayListA.get(i10);
                                        i10++;
                                        gVarL.getClass();
                                        B9.a.Q(gVarL.f495a, false, true, new A3.e(0, gVarL, new E3.b[]{(E3.b) obj5}));
                                    }
                                    inputStreamOpenInputStream = inputStream;
                                }
                            } while (objR != aVar4);
                            return aVar4;
                        }
                        z10 = false;
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                        z11 = z10;
                    } catch (Exception e12) {
                        e = e12;
                        ((a) r12).b(e);
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                            break;
                        }
                        return Boolean.valueOf(z11);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                        break;
                    }
                    throw th;
                }
                break;
                return Boolean.valueOf(z11);
            default:
                V v11 = (V) obj3;
                int i13 = this.f20337s;
                try {
                    try {
                        if (i13 == 0) {
                            p110k9.a.e(obj);
                            InterfaceC0402u interfaceC0402u = (InterfaceC0402u) this.f20342x;
                            T t2 = (T) this.f20343y;
                            f fVarI = interfaceC0402u.getCoroutineContext().i(r.f5392s);
                            j.b(fVarI);
                            U u10 = new U(t2, (a0) fVarI);
                            V.a(v11, u10);
                            aVar2 = v11.f24461b;
                            i iVar = (i) obj2;
                            this.f20342x = u10;
                            this.f20338t = aVar2;
                            this.f20339u = iVar;
                            this.f20340v = r12;
                            this.f20341w = v11;
                            this.f20337s = 1;
                            if (aVar2.e(this) == aVar4) {
                                return aVar4;
                            }
                            u8 = u10;
                            r10 = iVar;
                            r11 = r12;
                        } else {
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                v10 = (V) this.f20339u;
                                aVar3 = (S9.a) this.f20338t;
                                u8 = (U) this.f20342x;
                                try {
                                    p110k9.a.e(obj);
                                    atomicReference2 = v10.f24460a;
                                    while (!atomicReference2.compareAndSet(u8, null) && atomicReference2.get() == u8) {
                                    }
                                    aVar3.b(null);
                                    return obj;
                                } catch (Throwable th6) {
                                    th2 = th6;
                                    atomicReference = v10.f24460a;
                                    while (!atomicReference.compareAndSet(u8, null)) {
                                    }
                                    throw th2;
                                }
                            }
                            v11 = (V) this.f20341w;
                            Object obj6 = this.f20340v;
                            e eVar = (e) this.f20339u;
                            S9.a aVar6 = (S9.a) this.f20338t;
                            U u11 = (U) this.f20342x;
                            p110k9.a.e(obj);
                            aVar2 = aVar6;
                            u8 = u11;
                            r10 = eVar;
                            r11 = obj6;
                        }
                        this.f20342x = u8;
                        this.f20338t = aVar2;
                        this.f20339u = v11;
                        this.f20340v = null;
                        this.f20341w = null;
                        this.f20337s = 2;
                        Object objInvoke = r10.invoke(r11, this);
                        if (objInvoke == aVar4) {
                            return aVar4;
                        }
                        aVar3 = aVar2;
                        obj = objInvoke;
                        v10 = v11;
                        atomicReference2 = v10.f24460a;
                        while (!atomicReference2.compareAndSet(u8, null)) {
                        }
                        aVar3.b(null);
                        return obj;
                    } catch (Throwable th7) {
                        th2 = th7;
                        v10 = v11;
                        atomicReference = v10.f24460a;
                        while (!atomicReference.compareAndSet(u8, null) && atomicReference.get() == u8) {
                        }
                        throw th2;
                    }
                } catch (Throwable th8) {
                    r12.b(null);
                    throw th8;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(T t2, V v10, e eVar, Object obj, c cVar) {
        super(2, cVar);
        this.f20343y = t2;
        this.f20344z = v10;
        this.f20334A = (i) eVar;
        this.f20335B = obj;
    }
}
