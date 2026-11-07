package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class s implements InterfaceC0774b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SidecarInterface f13097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f13098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f13099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f13100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public android.support.v4.media.session.r f13101e;

    public s(Context context) {
        SidecarInterface sidecarInterfaceA = q.a(context);
        p pVar = new p();
        this.f13097a = sidecarInterfaceA;
        this.f13098b = pVar;
        this.f13099c = new LinkedHashMap();
        this.f13100d = new LinkedHashMap();
    }

    public final A a(Activity activity) {
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new A(p120l9.r.f19440r);
        }
        SidecarInterface sidecarInterface = this.f13097a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinder);
        SidecarInterface sidecarInterface2 = this.f13097a;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return this.f13098b.c(windowLayoutInfo, deviceState);
    }

    public final void b(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f13097a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.f13100d;
        activity.unregisterComponentCallbacks((ComponentCallbacks) linkedHashMap.get(activity));
        linkedHashMap.remove(activity);
        LinkedHashMap linkedHashMap2 = this.f13099c;
        boolean z10 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z10 || (sidecarInterface = this.f13097a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void c(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f13099c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f13097a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f13097a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        android.support.v4.media.session.r rVar = this.f13101e;
        if (rVar != null) {
            rVar.K(activity, a(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f13100d;
        if (linkedHashMap2.get(activity) == null) {
            r rVar2 = new r(this, activity);
            linkedHashMap2.put(activity, rVar2);
            activity.registerComponentCallbacks(rVar2);
        }
    }

    public final void d(t tVar) {
        this.f13101e = new android.support.v4.media.session.r(tVar);
        SidecarInterface sidecarInterface = this.f13097a;
        if (sidecarInterface == null) {
            return;
        }
        final SidecarInterface.SidecarCallback sidecarCallback = new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.SidecarCompat$TranslatingCallback
            @SuppressLint({"SyntheticAccessor"})
            public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                Window window;
                WindowManager.LayoutParams attributes;
                SidecarInterface sidecarInterface2;
                p251z9.j.e(sidecarDeviceState, "newDeviceState");
                Collection<Activity> collectionValues = this.f13065a.f13099c.values();
                s sVar = this.f13065a;
                for (Activity activity : collectionValues) {
                    SidecarWindowLayoutInfo windowLayoutInfo = null;
                    IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                    if (iBinder != null && (sidecarInterface2 = sVar.f13097a) != null) {
                        windowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinder);
                    }
                    android.support.v4.media.session.r rVar = sVar.f13101e;
                    if (rVar != null) {
                        rVar.K(activity, sVar.f13098b.c(windowLayoutInfo, sidecarDeviceState));
                    }
                }
            }

            @SuppressLint({"SyntheticAccessor"})
            public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                p251z9.j.e(iBinder, "windowToken");
                p251z9.j.e(sidecarWindowLayoutInfo, "newLayout");
                Activity activity = (Activity) this.f13065a.f13099c.get(iBinder);
                if (activity == null) {
                    Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                    return;
                }
                s sVar = this.f13065a;
                p pVar = sVar.f13098b;
                SidecarInterface sidecarInterface2 = sVar.f13097a;
                SidecarDeviceState deviceState = sidecarInterface2 == null ? null : sidecarInterface2.getDeviceState();
                if (deviceState == null) {
                    deviceState = new SidecarDeviceState();
                }
                A aC = pVar.c(sidecarWindowLayoutInfo, deviceState);
                android.support.v4.media.session.r rVar = this.f13065a.f13101e;
                if (rVar == null) {
                    return;
                }
                rVar.K(activity, aC);
            }
        };
        final p pVar = this.f13098b;
        sidecarInterface.setSidecarCallback(new SidecarInterface.SidecarCallback(pVar, sidecarCallback) { // from class: androidx.window.layout.SidecarCompat$DistinctSidecarElementCallback

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final p f13060a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SidecarInterface.SidecarCallback f13061b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ReentrantLock f13062c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public SidecarDeviceState f13063d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final WeakHashMap f13064e;

            {
                p251z9.j.e(pVar, "sidecarAdapter");
                this.f13060a = pVar;
                this.f13061b = sidecarCallback;
                this.f13062c = new ReentrantLock();
                this.f13064e = new WeakHashMap();
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
            
                if (androidx.window.layout.k.b(r2) == androidx.window.layout.k.b(r4)) goto L10;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState r4) {
                /*
                    r3 = this;
                    java.lang.String r0 = "newDeviceState"
                    p251z9.j.e(r4, r0)
                    java.util.concurrent.locks.ReentrantLock r0 = r3.f13062c
                    r0.lock()
                    androidx.window.layout.p r1 = r3.f13060a     // Catch: java.lang.Throwable -> L34
                    androidx.window.sidecar.SidecarDeviceState r2 = r3.f13063d     // Catch: java.lang.Throwable -> L34
                    r1.getClass()     // Catch: java.lang.Throwable -> L34
                    boolean r1 = p251z9.j.a(r2, r4)     // Catch: java.lang.Throwable -> L34
                    if (r1 == 0) goto L18
                    goto L25
                L18:
                    if (r2 != 0) goto L1b
                    goto L29
                L1b:
                    int r1 = androidx.window.layout.k.b(r2)     // Catch: java.lang.Throwable -> L34
                    int r2 = androidx.window.layout.k.b(r4)     // Catch: java.lang.Throwable -> L34
                    if (r1 != r2) goto L29
                L25:
                    r0.unlock()
                    return
                L29:
                    r3.f13063d = r4     // Catch: java.lang.Throwable -> L34
                    androidx.window.sidecar.SidecarInterface$SidecarCallback r1 = r3.f13061b     // Catch: java.lang.Throwable -> L34
                    r1.onDeviceStateChanged(r4)     // Catch: java.lang.Throwable -> L34
                    r0.unlock()
                    return
                L34:
                    r4 = move-exception
                    r0.unlock()
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat$DistinctSidecarElementCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
            }

            public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                boolean zB;
                p251z9.j.e(iBinder, "token");
                p251z9.j.e(sidecarWindowLayoutInfo, "newLayout");
                synchronized (this.f13062c) {
                    SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f13064e.get(iBinder);
                    this.f13060a.getClass();
                    if (p251z9.j.a(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                        zB = true;
                    } else {
                        zB = sidecarWindowLayoutInfo2 == null ? false : p.b(k.c(sidecarWindowLayoutInfo2), k.c(sidecarWindowLayoutInfo));
                    }
                    if (zB) {
                        return;
                    }
                    this.f13061b.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
                }
            }
        });
    }

    public final boolean e() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f13097a;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method == null ? null : method.getReturnType();
            Class cls5 = Void.TYPE;
            if (!p251z9.j.a(returnType, cls5)) {
                throw new NoSuchMethodException(p251z9.j.j(returnType, "Illegal return type for 'setSidecarCallback': "));
            }
            SidecarInterface sidecarInterface2 = this.f13097a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f13097a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f13097a;
            Method method2 = (sidecarInterface4 == null || (cls2 = sidecarInterface4.getClass()) == null) ? null : cls2.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 == null ? null : method2.getReturnType();
            if (!p251z9.j.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(p251z9.j.j(returnType2, "Illegal return type for 'getWindowLayoutInfo': "));
            }
            SidecarInterface sidecarInterface5 = this.f13097a;
            Method method3 = (sidecarInterface5 == null || (cls3 = sidecarInterface5.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 == null ? null : method3.getReturnType();
            if (!p251z9.j.a(returnType3, cls5)) {
                throw new NoSuchMethodException(p251z9.j.j(returnType3, "Illegal return type for 'onWindowLayoutChangeListenerAdded': "));
            }
            SidecarInterface sidecarInterface6 = this.f13097a;
            Method method4 = (sidecarInterface6 == null || (cls4 = sidecarInterface6.getClass()) == null) ? null : cls4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 == null ? null : method4.getReturnType();
            if (!p251z9.j.a(returnType4, cls5)) {
                throw new NoSuchMethodException(p251z9.j.j(returnType4, "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            p251z9.j.d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
                if (!arrayList.equals((List) objInvoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }
}
