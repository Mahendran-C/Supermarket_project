USE [Supermarket]
GO

/****** Object:  Table [dbo].[Brand]    Script Date: 8/1/2020 12:15:11 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Brand]') AND type in (N'U'))
DROP TABLE [dbo].[Brand]
GO

/****** Object:  Table [dbo].[Brand]    Script Date: 8/1/2020 12:15:11 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[brand](
	[brand_id] [int]identity(1,1) NOT NULL,
	[name] [varchar](30) NOT NULL,
	[category_Id] [int] NOT NULL,
	[subCategory_Id] [int] NOT NULL,
	[product_Id] [int] NOT NULL,
	[createdat] [varchar](50) NULL,
 CONSTRAINT [PK_Brand] PRIMARY KEY CLUSTERED 
(
	[Brand_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


