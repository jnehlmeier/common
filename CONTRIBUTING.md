# Contributing

This project is licensed under the Apache License 2.0 and accepts pull-requests.

To improve tracking of who did what, this project uses the "sign-off"
procedure introduced by the Linux kernel.
The sign-off is a simple line at the end of the explanation for the
patch, which certifies that you wrote it or otherwise have the right
to pass it on as an open-source patch.

__The rules are pretty simple:__

If you can certify the Developer's
Certificate of Origin 1.1 (see [DCO](https://raw.githubusercontent.com/jnehlmeier/common/master/DCO "Certificate of Origin 1.1") file),
then you just add a line saying

  Signed-off-by: Random J Developer <<random@developer.example.org>>

using your real name (sorry, no pseudonyms or anonymous
contributions) and email address. This line can be automatically added by git if you
run the git-commit command with the -s option.

## Commit message format

```
A short summary (what)

A more detailed explanation why this change has been done (why).
An explanation can be omitted if the change is small and the summary
is already self-explanatory.

Signed-off-by: Random J Developer <random@developer.example.org>
```

Please make sure your summary line isn't longer than about 50 chars and the
explanation block wraps at 72 chars.
If you have trouble finding a short summary line that fits into about 50 chars then
your commit / pull request probably does too much and you might want to split it.
