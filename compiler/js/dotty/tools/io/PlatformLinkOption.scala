package dotty.tools.io

enum PlatformLinkOption extends PlatformOpenOption, PlatformCopyOption:
  /**
   * Do not follow symbolic links.
   */
  case NOFOLLOW_LINKS