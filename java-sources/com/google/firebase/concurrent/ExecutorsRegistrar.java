package com.google.firebase.concurrent;

import W2.n;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p017b7.g;
import p091i8.b;
import p091i8.c;
import p100j8.d;
import p100j8.l;
import p100j8.p;
import p109k8.a;
import p109k8.f;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f15395a = new l(new d(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f15396b = new l(new d(3));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f15397c = new l(new d(4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f15398d = new l(new d(5));

    public static f a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new f(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) f15398d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        p pVar = new p(p091i8.a.class, ScheduledExecutorService.class);
        p[] pVarArr = {new p(p091i8.a.class, ExecutorService.class), new p(p091i8.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            g.R(pVar2, "Null interface");
        }
        Collections.addAll(hashSet, pVarArr);
        p100j8.a aVar = new p100j8.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new n(21), hashSet3);
        p pVar3 = new p(b.class, ScheduledExecutorService.class);
        p[] pVarArr2 = {new p(b.class, ExecutorService.class), new p(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(pVar3);
        for (p pVar4 : pVarArr2) {
            g.R(pVar4, "Null interface");
        }
        Collections.addAll(hashSet4, pVarArr2);
        p100j8.a aVar2 = new p100j8.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new n(22), hashSet6);
        p pVar5 = new p(c.class, ScheduledExecutorService.class);
        p[] pVarArr3 = {new p(c.class, ExecutorService.class), new p(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(pVar5);
        for (p pVar6 : pVarArr3) {
            g.R(pVar6, "Null interface");
        }
        Collections.addAll(hashSet7, pVarArr3);
        p100j8.a aVar3 = new p100j8.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new n(23), hashSet9);
        p071g9.a aVarA = p100j8.a.a(new p(p091i8.d.class, Executor.class));
        aVarA.f16340f = new n(24);
        return Arrays.asList(aVar, aVar2, aVar3, aVarA.b());
    }
}
