package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import u.C1350e;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0902x2 implements b8.d, B2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0818g2 f14508s = new C0818g2(3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f14509r;

    public /* synthetic */ C0902x2(Object obj) {
        this.f14509r = obj;
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public boolean a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (((B2[]) this.f14509r)[i10].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public J2 b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            B2 b5 = ((B2[]) this.f14509r)[i10];
            if (b5.a(cls)) {
                return b5.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public Object c() {
        G1 g10 = (G1) this.f14509r;
        ContentResolver contentResolver = g10.f14034a;
        Uri uri = g10.f14035b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, G1.j, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map map = Collections.EMPTY_MAP;
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map c1350e = count <= 256 ? new C1350e(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        c1350e.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return c1350e;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } catch (Throwable th) {
                    if (cursorQuery == null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (RemoteException e10) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }

    public void d(int i10, Object obj, K2 k7) {
        T1 t2 = (T1) obj;
        C0788a2 c0788a2 = (C0788a2) this.f14509r;
        c0788a2.q0((i10 << 3) | 2);
        c0788a2.q0(t2.b(k7));
        k7.g(t2, c0788a2.f14196f);
    }

    public void e(int i10, Object obj, K2 k7) {
        C0788a2 c0788a2 = (C0788a2) this.f14509r;
        c0788a2.h0(i10, 3);
        k7.g((T1) obj, c0788a2.f14196f);
        c0788a2.h0(i10, 4);
    }

    @Override // b8.d
    public /* synthetic */ Object get() {
        Object obj = O1.g;
        return K1.m((Context) this.f14509r);
    }

    public C0902x2(int i10) {
        switch (i10) {
            case 1:
                this.f14509r = new HashMap();
                break;
            default:
                H2 h7 = H2.f14042c;
                C0902x2 c0902x2 = new C0902x2(new B2[]{C0818g2.f14253s, f14508s});
                Charset charset = AbstractC0863p2.f14382a;
                this.f14509r = c0902x2;
                break;
        }
    }

    public C0902x2(C0788a2 c0788a2) {
        Charset charset = AbstractC0863p2.f14382a;
        this.f14509r = c0788a2;
        c0788a2.f14196f = this;
    }
}
