package p109k8;

import Z0.B;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f19048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Runnable f19049t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B f19050u;

    public /* synthetic */ d(f fVar, Runnable runnable, B b5, int i10) {
        this.f19047r = i10;
        this.f19048s = fVar;
        this.f19049t = runnable;
        this.f19050u = b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19047r) {
            case 0:
                ExecutorService executorService = this.f19048s.f19054r;
                final int i10 = 0;
                final Runnable runnable = this.f19049t;
                final B b5 = this.f19050u;
                executorService.execute(new Runnable() { // from class: k8.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) b5.f10875s).k(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) b5.f10875s).k(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) b5.f10875s;
                                try {
                                    runnable2.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.k(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f19048s.f19054r;
                final int i11 = 2;
                final Runnable runnable2 = this.f19049t;
                final B b10 = this.f19050u;
                executorService2.execute(new Runnable() { // from class: k8.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) b10.f10875s).k(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) b10.f10875s).k(e11);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                h hVar = (h) b10.f10875s;
                                try {
                                    runnable3.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.k(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f19048s.f19054r;
                final int i12 = 1;
                final Runnable runnable3 = this.f19049t;
                final B b11 = this.f19050u;
                executorService3.execute(new Runnable() { // from class: k8.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) b11.f10875s).k(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) b11.f10875s).k(e11);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                h hVar = (h) b11.f10875s;
                                try {
                                    runnable4.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.k(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
